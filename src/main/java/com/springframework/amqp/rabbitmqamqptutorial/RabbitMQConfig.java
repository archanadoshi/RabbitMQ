package com.springframework.amqp.rabbitmqamqptutorial;

import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Autowired
    ConnectionFactory connectionFactory;

    @Autowired
    RabbitMQQueueConfig rabbitMQQueueConfig;

    @Autowired
    RabbitMQMessageListener rabbitMQMessageListener;

    @Bean
    MessageListenerContainer messageListenerContainer()
    {
        SimpleMessageListenerContainer simpleMessageListenerContainer = new SimpleMessageListenerContainer(connectionFactory);
        simpleMessageListenerContainer.addQueues(rabbitMQQueueConfig.getQueueUsingBinder());
        simpleMessageListenerContainer.setupMessageListener(rabbitMQMessageListener);
        return simpleMessageListenerContainer;
    }
}
