package com.github.marcelomachadoxd.hrpayrollms.services;

import com.github.marcelomachadoxd.hrpayrollms.entities.Payment;
import com.github.marcelomachadoxd.hrpayrollms.entities.Worker;
import com.github.marcelomachadoxd.hrpayrollms.feigncleints.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, Integer days) {
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }


}
