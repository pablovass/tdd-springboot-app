package com.pablovass.payments;

public interface PaymentGateway {
    PaymentResponse resquestPayment(PaymentRequest request);
}
