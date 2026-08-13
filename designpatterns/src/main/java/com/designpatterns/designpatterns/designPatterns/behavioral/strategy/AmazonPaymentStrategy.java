package com.designpatterns.designpatterns.designPatterns.behavioral.strategy;

import org.springframework.stereotype.Component;

@Component
public class AmazonPaymentStrategy implements PaymentStrategy{
    @Override
    public PaymentType getType() {
        return PaymentType.AMAZONPAYMENT;
    }

    @Override
    public String pay(double amount) {
        return amount + " is paid via Amazon Pay";
    }
}
