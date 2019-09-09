package com.springframework.amqp.rabbitmq;

import org.springframework.amqp.core.*;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    private static final String myQueue = "TQueue";

    @Bean
    Exchange getExchange()
    {
        return ExchangeBuilder.topicExchange("TExchange")
                .build();
    }

    @Bean
    Queue getQueueUsingBinder()
    {
        return QueueBuilder.durable(myQueue)
                .build();
    }

    @Bean
    public Binding getBinding()
    {
        return BindingBuilder
                .bind(getQueueUsingBinder())
                .to(getExchange())
                .with("TRouting").noargs();
    }

    @Bean
    public MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}
