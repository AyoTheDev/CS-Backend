package com.scienta.cs.notification.email.models;

import com.scienta.cs.notification.core.models.enums.NotificationType;
import com.scienta.cs.notification.core.models.interfaces.Notifiable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MailNotifiable implements Notifiable {

    private String to;
    private String title;
    private String content;

    private List<File> attachments;

    @Override
    public NotificationType type() {
        return NotificationType.EMAIL;
    }

    @Override
    public String to() {
        return to;
    }

    @Override
    public String content() {
        return this.content;
    }

    @Override
    public String title() {
        return this.title;
    }
}
