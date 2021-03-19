package com.topicisp.salon.model;

public class PAYMENTS_DW {
    private int payment_id;
    private int payment_method_id;
    private String payment_method_name;
    private String payment_method_description;

    public PAYMENTS_DW() {
    }

    public PAYMENTS_DW(int payment_id, int payment_method_id, String payment_method_name, String payment_method_description) {
        this.payment_id = payment_id;
        this.payment_method_id = payment_method_id;
        this.payment_method_name = payment_method_name;
        this.payment_method_description = payment_method_description;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public int getPayment_method_id() {
        return payment_method_id;
    }

    public void setPayment_method_id(int payment_method_id) {
        this.payment_method_id = payment_method_id;
    }

    public String getPayment_method_name() {
        return payment_method_name;
    }

    public void setPayment_method_name(String payment_method_name) {
        this.payment_method_name = payment_method_name;
    }

    public String getPayment_method_description() {
        return payment_method_description;
    }

    public void setPayment_method_description(String payment_method_description) {
        this.payment_method_description = payment_method_description;
    }

    @Override
    public String toString() {
        return "PAYMENTS_DW{" +
                "payment_id=" + payment_id +
                ", payment_method_id=" + payment_method_id +
                ", payment_method_name='" + payment_method_name + '\'' +
                ", payment_method_description='" + payment_method_description + '\'' +
                '}';
    }
}
