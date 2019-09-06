package com.springframework.amqp.rabbitmqamqptutorial;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        System.out.println("Message : " + new String(message.getBody()));
    }
}
