package com.springframework.amqp.rabbitmqamqptutorial;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQQueueConfig {

    private static final String myQueue = "RBuilderQueue";

//    @Bean
//    Queue getQueue()
//    {
//        return new Queue("RQueue", true);
//    }

    @Bean
    Queue getQueueUsingBinder()
    {
        return QueueBuilder.durable(myQueue)
                .autoDelete()
                .exclusive()
                .build();
    }
}
