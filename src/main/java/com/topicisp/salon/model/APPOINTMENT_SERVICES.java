package com.topicisp.salon.model;

public class APPOINTMENT_SERVICES {
    private int appointment_id;
    private int salon_service_id;
    private int staff_id;
    private Double service_price;

    public APPOINTMENT_SERVICES() {
    }

    public APPOINTMENT_SERVICES(int appointment_id, int salon_service_id, int staff_id, Double service_price) {
        this.appointment_id = appointment_id;
        this.salon_service_id = salon_service_id;
        this.staff_id = staff_id;
        this.service_price = service_price;
    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
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

    public Double getService_price() {
        return service_price;
    }

    public void setService_price(Double service_price) {
        this.service_price = service_price;
    }

    @Override
    public String toString() {
        return "APPOINTMENT_SERVICES{" +
                "appointment_id=" + appointment_id +
                ", salon_service_id=" + salon_service_id +
                ", staff_id=" + staff_id +
                ", service_price=" + service_price +
                '}';
    }
}
