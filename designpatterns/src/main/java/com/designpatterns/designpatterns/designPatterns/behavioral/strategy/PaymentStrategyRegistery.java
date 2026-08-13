package com.designpatterns.designpatterns.designPatterns.behavioral.strategy;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class PaymentStrategyRegistery {
    private final Map<PaymentType,PaymentStrategy> paymentStrategyMap;

    public PaymentStrategyRegistery(List<PaymentStrategy>strategies) {
        this.paymentStrategyMap=strategies.stream().collect(Collectors.toMap(PaymentStrategy::getType, Function.identity()));
    }
    public PaymentStrategy getStrategy(PaymentType paymentType) {
        return paymentStrategyMap.get(paymentType);
    }
}
