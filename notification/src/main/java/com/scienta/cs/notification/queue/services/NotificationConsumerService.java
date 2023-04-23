package com.scienta.cs.notification.queue.services;


import com.scienta.cs.notification.queue.models.messages.NotificationWrapperMessage;

public interface NotificationConsumerService {

    void consume(NotificationWrapperMessage message);

}
