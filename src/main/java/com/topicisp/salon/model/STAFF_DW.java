package com.topicisp.salon.model;

public class STAFF_DW {
    private int staff_id;
    private int job_id;
    private String job_title;
    private String staff_name;
    private int base_salary;

    public STAFF_DW() {
    }

    public STAFF_DW(int staff_id, int job_id, String job_title, String staff_name, int base_salary) {
        this.staff_id = staff_id;
        this.job_id = job_id;
        this.job_title = job_title;
        this.staff_name = staff_name;
        this.base_salary = base_salary;
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

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public int getBase_salary() {
        return base_salary;
    }

    public void setBase_salary(int base_salary) {
        this.base_salary = base_salary;
    }

    @Override
    public String toString() {
        return "STAFF_DW{" +
                "staff_id=" + staff_id +
                ", job_id=" + job_id +
                ", job_title='" + job_title + '\'' +
                ", staff_name='" + staff_name + '\'' +
                ", base_salary=" + base_salary +
                '}';
    }
}
