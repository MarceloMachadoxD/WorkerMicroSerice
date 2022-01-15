package com.github.marcelomachadoxd.hrpayrollms.services;

import com.github.marcelomachadoxd.hrpayrollms.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, Integer days) {
        return new Payment("Bob", 200.0d, days); //temporary mock
    }


}
