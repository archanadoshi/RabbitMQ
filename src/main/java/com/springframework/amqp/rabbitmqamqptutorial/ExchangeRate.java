package com.springframework.amqp.rabbitmqamqptutorial;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExchangeRate implements Serializable {
    private String fromCurrency;
    private String toCurrency;
}
