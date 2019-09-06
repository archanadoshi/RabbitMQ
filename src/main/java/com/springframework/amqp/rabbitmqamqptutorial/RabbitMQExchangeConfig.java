package com.springframework.amqp.rabbitmqamqptutorial;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQExchangeConfig {

    @Bean
    Exchange getExchange()
    {
        return ExchangeBuilder.topicExchange("RExchange")
                .durable(true)
                .build();
        //return new TopicExchange("RExchange");

    }

//    @Bean
//    Exchange getDirectExchange()
//    {
//        return ExchangeBuilder.directExchange("RDirectExchange")
//                .autoDelete()
//                .durable(true)
//                .build();
//    }
}
