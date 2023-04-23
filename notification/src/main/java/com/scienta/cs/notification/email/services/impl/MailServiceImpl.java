package com.scienta.cs.notification.email.services.impl;

import com.scienta.cs.notification.email.models.MailNotifiable;
import com.scienta.cs.notification.email.services.MailService;
import com.scienta.cs.notification.queue.models.messages.NotificationWrapperMessage;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class MailServiceImpl extends MailService {

    private final JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String username;

    @Override
    public void sendMail(MailNotifiable notifiable) {
        MimeMessagePreparator preparator = mimeMessage -> {
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(notifiable.getTo()));
            mimeMessage.setFrom(username);
            mimeMessage.setSubject(notifiable.getTitle());
            mimeMessage.setText(notifiable.getContent());
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, !CollectionUtils.isEmpty(notifiable.getAttachments()));

            if(!CollectionUtils.isEmpty(notifiable.getAttachments())) {
                notifiable.getAttachments().forEach(attachment->{
                    FileSystemResource file = new FileSystemResource(attachment);
                    try {
                        helper.addAttachment(attachment.getName(), file);
                        helper.setText(notifiable.getContent());
                    } catch (MessagingException e) {
                        log.error("ERROR WHILE CREATING ATTACHMENT TO MAIL {} , MSG = {}", notifiable, e.getMessage(), e);
                    }
                });
            }
        };

        try {
            javaMailSender.send(preparator);
        }
        catch (Exception ex) {
            log.error("ERROR WHILE SENDING MAIL TO = {} MSG = {}", notifiable, ex.getMessage(), ex);
        }
    }

    @Override
    public MailNotifiable convertWrapperToMailNotifiable(NotificationWrapperMessage message) {
        var result = MailNotifiable.builder()
                .title(message.getTitle())
                .content(message.getContent())
                .to(message.getTo())
                .build();

        if(!CollectionUtils.isEmpty(message.getAttachmentFilesUrl())) {
            List<File> files = new ArrayList<>();
            for (String url : message.getAttachmentFilesUrl()) {
                try {
                    File file = new File(FilenameUtils.getName(url));
                    FileUtils.copyURLToFile(new URL(url), file);
                    files.add(file);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            result.setAttachments(files);
        }

        return result;
    }

}
