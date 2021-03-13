package com.topicisp.salon.model;

import java.util.Date;

public class APPOINTMENTS {
    private int appointment_id;
    private int client_id;
    private Date appointment_date;
    private String appointment_time;

    public APPOINTMENTS() {
    }

    public APPOINTMENTS(int appointment_id, int client_id, Date appointment_date, String appointment_time) {
        this.appointment_id = appointment_id;
        this.client_id = client_id;
        this.appointment_date = appointment_date;
        this.appointment_time = appointment_time;
    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public Date getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(Date appointment_date) {
        this.appointment_date = appointment_date;
    }

    public String getAppointment_time() {
        return appointment_time;
    }

    public void setAppointment_time(String appointment_time) {
        this.appointment_time = appointment_time;
    }

    @Override
    public String toString() {
        return "APPOINTMENTS{" +
                "appointment_id=" + appointment_id +
                ", client_id=" + client_id +
                ", appointment_date=" + appointment_date +
                ", appointment_time='" + appointment_time + '\'' +
                '}';
    }
}
