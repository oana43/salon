package com.topicisp.salon.model;

public class STAFF_JOB_TITLE_DW {
    private int job_id;
    private String job_name;
    private String job_description;

    public STAFF_JOB_TITLE_DW() {
    }

    public STAFF_JOB_TITLE_DW(int job_id, String job_name, String job_description) {
        this.job_id = job_id;
        this.job_name = job_name;
        this.job_description = job_description;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

    @Override
    public String toString() {
        return "STAFF_JOB_TITLE_DW{" +
                "job_id=" + job_id +
                ", job_name='" + job_name + '\'' +
                ", job_description='" + job_description + '\'' +
                '}';
    }
}
