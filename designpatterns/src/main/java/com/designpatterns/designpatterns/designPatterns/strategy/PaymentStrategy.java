package com.designpatterns.designpatterns.designPatterns.strategy;

public interface PaymentStrategy {
    PaymentType getType();
    String pay(double amount);
}
