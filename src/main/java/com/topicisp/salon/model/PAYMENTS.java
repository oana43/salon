package com.topicisp.salon.model;

public class PAYMENTS {
    private int payment_id;
    private int appointment_id;
    private int payment_method_id;
    private Double total_price;
    private Double final_price;

    public PAYMENTS() {
    }

    public PAYMENTS(int payment_id, int appointment_id, int payment_method_id, Double total_price, Double final_price) {
        this.payment_id = payment_id;
        this.appointment_id = appointment_id;
        this.payment_method_id = payment_method_id;
        this.total_price = total_price;
        this.final_price = final_price;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public int getPayment_method_id() {
        return payment_method_id;
    }

    public void setPayment_method_id(int payment_method_id) {
        this.payment_method_id = payment_method_id;
    }

    public Double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }

    public Double getFinal_price() {
        return final_price;
    }

    public void setFinal_price(Double final_price) {
        this.final_price = final_price;
    }

    @Override
    public String toString() {
        return "PAYMENTS{" +
                "payment_id=" + payment_id +
                ", appointment_id=" + appointment_id +
                ", payment_method_id=" + payment_method_id +
                ", total_price=" + total_price +
                ", final_price=" + final_price +
                '}';
    }
}
