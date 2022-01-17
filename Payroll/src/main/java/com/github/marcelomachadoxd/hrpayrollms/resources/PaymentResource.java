package com.github.marcelomachadoxd.hrpayrollms.resources;

import com.github.marcelomachadoxd.hrpayrollms.entities.Payment;
import com.github.marcelomachadoxd.hrpayrollms.services.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentResource {

    @Autowired
    private PaymentService paymentService;

    @HystrixCommand(fallbackMethod = "getPaymentFallback")
    @GetMapping("/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(
            @PathVariable Long workerId,
            @PathVariable Integer days) {

        Payment payment = paymentService.getPayment(workerId, days);
        return ResponseEntity.ok(payment);
    }

    public ResponseEntity<Payment> getPaymentFallback(
            @PathVariable Long workerId,
            @PathVariable Integer days){
        return ResponseEntity.ok(new Payment("Error processing payment ", 0.00d,  0));
    }


}
