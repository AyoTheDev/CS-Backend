package com.scienta.cs.notification.queue.services.impl;

import com.scienta.cs.notification.core.models.interfaces.SenderService;
import com.scienta.cs.notification.queue.services.NotificationConsumerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.scienta.cs.notification.queue.models.messages.NotificationWrapperMessage;


import java.util.List;
import java.util.Objects;

@Service
@Slf4j
@RequiredArgsConstructor
public class NotificationConsumerServiceImpl implements NotificationConsumerService {

    private final List<SenderService> senderServiceList;

    @Override
    public void consume(NotificationWrapperMessage message) {
        log.info("MESSAGE = {}", message);

        for (SenderService senderService : senderServiceList) {
            if (senderService.getType() == message.getType()) {
                senderService.convertWrapperToNotifiableAndSend(message);
            }
        }
    }
}

