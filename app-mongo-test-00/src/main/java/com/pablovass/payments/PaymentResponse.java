package com.pablovass.payments;

public class PaymentResponse {
    enum PaymentStatus{
        OK, ERROR
    }
    //contiente un codigo de respuesta
    private PaymentStatus status;

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
