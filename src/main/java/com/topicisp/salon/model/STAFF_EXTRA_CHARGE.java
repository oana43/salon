package com.topicisp.salon.model;

public class STAFF_EXTRA_CHARGE {
    private int job_id;
    private int salon_service_id;
    private int charge_amount;

    public STAFF_EXTRA_CHARGE() {}

    public STAFF_EXTRA_CHARGE(int job_id, int salon_service_id, int charge_amount) {
        this.job_id = job_id;
        this.salon_service_id = salon_service_id;
        this.charge_amount = charge_amount;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getSalon_service_id() {
        return salon_service_id;
    }

    public void setSalon_service_id(int salon_service_id) {
        this.salon_service_id = salon_service_id;
    }

    public int getCharge_amount() {
        return charge_amount;
    }

    public void setCharge_amount(int charge_amount) {
        this.charge_amount = charge_amount;
    }

    @Override
    public String toString() {
        return "STAFF_EXTRA_CHARGE{" +
                "job_id=" + job_id +
                ", salon_service_id=" + salon_service_id +
                ", charge_amount=" + charge_amount +
                '}';
    }
}
