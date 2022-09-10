package com.pablovass.test.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PaymentProcessorTest {
    private PaymentGateway paymentGateway;
    private  PaymentProcessor paymentProcessor;
    @Before
    //metodo paraevitar codigo repetido
    public  void  setup(){
         paymentGateway = Mockito.mock(PaymentGateway.class);// COMO NO TENEMOS LA PASARELA DE PAGO LA MOKEAMOS
         paymentProcessor =new  PaymentProcessor(paymentGateway);

    }
    @Test
    public void payment_is_correct() {
        //preparacion del test
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).
                thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        //resultado esperado
        boolean result=paymentProcessor.makePayment(1000);
        //comprobacion
        assertTrue(result);

    }
    @Test
    public void payment_is_wrong() {
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);// COMO NO TENEMOS LA PASARELA DE PAGO LA MOKEAMOS
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).
                thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        PaymentProcessor paymentProcessor =new  PaymentProcessor(paymentGateway);

        //boolean result= paymentProcessor.makePayment(1000);
        assertFalse(paymentProcessor.makePayment(1000));

    }
}