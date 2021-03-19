package com.topicisp.salon.model;

import java.util.Date;

public class SERVICES_VALUE_DW {
    private int service_value_id;
    private int client_id;
    private int salon_service_id;
    private int staff_id;
    private int job_id;
    private Date appointment_date;
    private int payment_id;
    private int promotion_id;
    private int appointment_id;
    private int age_discount;
    private int promotion_discount;
    private Double service_price;
    private Double service_price_w_discount;

    public SERVICES_VALUE_DW() {
    }

    public SERVICES_VALUE_DW(int service_value_id, int client_id, int salon_service_id, int staff_id, int job_id, Date appointment_date, int payment_id, int promotion_id, int appointment_id, int age_discount, int promotion_discount, Double service_price, Double service_price_w_discount) {
        this.service_value_id = service_value_id;
        this.client_id = client_id;
        this.salon_service_id = salon_service_id;
        this.staff_id = staff_id;
        this.job_id = job_id;
        this.appointment_date = appointment_date;
        this.payment_id = payment_id;
        this.promotion_id = promotion_id;
        this.appointment_id = appointment_id;
        this.age_discount = age_discount;
        this.promotion_discount = promotion_discount;
        this.service_price = service_price;
        this.service_price_w_discount = service_price_w_discount;
    }

    public int getService_value_id() {
        return service_value_id;
    }

    public void setService_value_id(int service_value_id) {
        this.service_value_id = service_value_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getSalon_service_id() {
        return salon_service_id;
    }

    public void setSalon_service_id(int salon_service_id) {
        this.salon_service_id = salon_service_id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public Date getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(Date appointment_date) {
        this.appointment_date = appointment_date;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public int getPromotion_id() {
        return promotion_id;
    }

    public void setPromotion_id(int promotion_id) {
        this.promotion_id = promotion_id;
    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public int getAge_discount() {
        return age_discount;
    }

    public void setAge_discount(int age_discount) {
        this.age_discount = age_discount;
    }

    public int getPromotion_discount() {
        return promotion_discount;
    }

    public void setPromotion_discount(int promotion_discount) {
        this.promotion_discount = promotion_discount;
    }

    public Double getService_price() {
        return service_price;
    }

    public void setService_price(Double service_price) {
        this.service_price = service_price;
    }

    public Double getService_price_w_discount() {
        return service_price_w_discount;
    }

    public void setService_price_w_discount(Double service_price_w_discount) {
        this.service_price_w_discount = service_price_w_discount;
    }

    @Override
    public String toString() {
        return "SERVICES_VALUE_DW{" +
                "service_value_id=" + service_value_id +
                ", client_id=" + client_id +
                ", salon_service_id=" + salon_service_id +
                ", staff_id=" + staff_id +
                ", job_id=" + job_id +
                ", appointment_date=" + appointment_date +
                ", payment_id=" + payment_id +
                ", promotion_id=" + promotion_id +
                ", appointment_id=" + appointment_id +
                ", age_discount=" + age_discount +
                ", promotion_discount=" + promotion_discount +
                ", service_price=" + service_price +
                ", service_price_w_discount=" + service_price_w_discount +
                '}';
    }
}
