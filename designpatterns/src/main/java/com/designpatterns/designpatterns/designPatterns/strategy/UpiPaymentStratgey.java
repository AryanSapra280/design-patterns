package com.designpatterns.designpatterns.designPatterns.strategy;

import org.springframework.stereotype.Component;

@Component
public class UpiPaymentStratgey implements PaymentStrategy{
    @Override
    public PaymentType getType() {
        return PaymentType.UPI;
    }

    @Override
    public String pay(double amount) {
        return amount + " is paid via " + "upi payment";
    }
}
