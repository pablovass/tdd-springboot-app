package com.pablovass.test.payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest  request);

}
