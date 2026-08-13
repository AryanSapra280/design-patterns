package com.designpatterns.designpatterns.designPatterns.behavioral.strategy;

public interface PaymentStrategy {
    PaymentType getType();
    String pay(double amount);
}
