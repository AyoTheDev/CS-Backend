package com.scienta.cs.notification.core.models.interfaces;


import com.scienta.cs.notification.core.models.enums.NotificationType;
import com.scienta.cs.notification.queue.models.messages.NotificationWrapperMessage;

public interface SenderService {

    void convertWrapperToNotifiableAndSend(NotificationWrapperMessage message);

    NotificationType getType();

}
