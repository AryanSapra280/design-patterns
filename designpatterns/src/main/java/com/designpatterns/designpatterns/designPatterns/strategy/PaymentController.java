package com.designpatterns.designpatterns.designPatterns.strategy;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

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
