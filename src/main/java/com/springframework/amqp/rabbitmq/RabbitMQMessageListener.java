package com.springframework.amqp.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQMessageListener {

    @RabbitListener(queues = "TQueue")
    public void receiveMessage(ExchangeRate message){
        System.out.println("Message : " + message.getToCurrency() );
    }
}
