package com.scienta.cs.notification.queue;

import com.scienta.cs.notification.queue.models.messages.NotificationWrapperMessage;
import com.scienta.cs.notification.queue.services.NotificationConsumerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    private final NotificationConsumerService notificationConsumerService;

    @PostMapping("/send")
    private void send(@RequestBody NotificationWrapperMessage notificationWrapperMessage) {
        notificationConsumerService.consume(notificationWrapperMessage);
    }


}
