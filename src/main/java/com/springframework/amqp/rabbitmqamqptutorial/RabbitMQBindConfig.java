package com.springframework.amqp.rabbitmqamqptutorial;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQBindConfig {

    @Bean
    Binding getBinding()
    {
        return BindingBuilder
                .bind(new RabbitMQQueueConfig().getQueueUsingBinder())
                .to(new RabbitMQExchangeConfig().getExchange())
                .with("RRounting")
                .noargs();
    }
}
