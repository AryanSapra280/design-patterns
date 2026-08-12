package com.designpatterns.designpatterns.designPatterns.strategy;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class CodPaymentStrategy implements PaymentStrategy{
    @Override
    public PaymentType getType() {
        return PaymentType.COD;
    }

    @Override
    public String pay(double amount) {
        return amount + " is paid via COD";
    }
}
