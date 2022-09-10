package com.pablovass.test.payments;

public class PaymentResponse {

    private PaymentStatus status;

    enum PaymentStatus{
        OK,ERROR
    }

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
