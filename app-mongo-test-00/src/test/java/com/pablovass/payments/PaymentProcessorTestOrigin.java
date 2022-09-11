package com.pablovass.payments;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PaymentProcessorTestOrigin {
    @Test
    void payment_is_correct() {
        //como no podemos hacerder al payment gateway lo sumulamos con moquito
        PaymentGateway paymentGateway= Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.resquestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

      // boolean result =paymentProcessor.makePayment(1000);
       //assertTrue(result);
       assertTrue(paymentProcessor.makePayment(1000));

    }
    @Test
    void payment_is_wrong() {
        PaymentGateway paymentGateway= Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.resquestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

        assertFalse(paymentProcessor.makePayment(1000));

    }
}