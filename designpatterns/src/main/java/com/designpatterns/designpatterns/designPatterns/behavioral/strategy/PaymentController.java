package com.designpatterns.designpatterns.designPatterns.behavioral.strategy;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @GetMapping("")
    public String health() {
        return "app is working";
    }

    @PostMapping("/payment")
    public String upiPayment(@RequestParam PaymentType paymentType, @RequestParam double amount) {
      return paymentService.pay(paymentType,amount);
    }
}
