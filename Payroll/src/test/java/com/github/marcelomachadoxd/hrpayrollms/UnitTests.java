package com.github.marcelomachadoxd.hrpayrollms;

import com.github.marcelomachadoxd.hrpayrollms.entities.Payment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTests {

    @Test
    public void paymentShouldCalculateAmountToBePaid() {

        Payment payment = new Payment("Bob", 200.0, 10);

        assertEquals(payment.getTotalPayment(), 2000.0);


    }


}

