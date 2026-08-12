package com.designpatterns.designpatterns.designPatterns.strategy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentStrategyRegistery paymentStrategyRegistery;
    public String pay(PaymentType paymentType, double amount) {
        PaymentStrategy paymentStrategy = paymentStrategyRegistery.getStrategy(paymentType);
        return paymentStrategy.pay(amount);
    }
}
