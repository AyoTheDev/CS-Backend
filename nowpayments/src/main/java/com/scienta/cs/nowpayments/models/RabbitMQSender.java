package com.scienta.cs.nowpayments.models;

import com.scienta.cs.nowpayments.models.request.NPTransactionUpdateRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class RabbitMQSender implements MQSender {

    private final AmqpTemplate rabbitTemplate;
    private final RabbitMQProperties rabbitMQProperties;

    @Override
    public void send(NPTransactionUpdateRequest request) {
        rabbitTemplate.convertAndSend(rabbitMQProperties.getQueueName(), request);
        log.debug("Sent transaction update msg to MQ = " + request);
    }
}
