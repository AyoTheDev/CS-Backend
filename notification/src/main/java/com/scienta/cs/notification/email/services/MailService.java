package com.scienta.cs.notification.email.services;


import com.scienta.cs.notification.core.models.enums.NotificationType;
import com.scienta.cs.notification.core.models.interfaces.SenderService;
import com.scienta.cs.notification.email.models.MailNotifiable;
import com.scienta.cs.notification.queue.models.messages.NotificationWrapperMessage;

public abstract class MailService implements SenderService {

    public abstract void sendMail(MailNotifiable notifiable);

    public abstract MailNotifiable convertWrapperToMailNotifiable(NotificationWrapperMessage message);

    @Override
    public NotificationType getType() {
        return NotificationType.EMAIL;
    }

    @Override
    public void convertWrapperToNotifiableAndSend(NotificationWrapperMessage message) {
        this.sendMail(this.convertWrapperToMailNotifiable(message));
    }
}
