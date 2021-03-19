package com.topicisp.salon.model;

import java.util.Date;

public class PROMOTIONS_DW {
    private int promotion_id;
    private String promotion_name;
    private Date date_start;
    private Date date_end;

    public PROMOTIONS_DW() {}

    public PROMOTIONS_DW(int promotion_id, String promotion_name, Date date_start, Date date_end) {
        this.promotion_id = promotion_id;
        this.promotion_name = promotion_name;
        this.date_start = date_start;
        this.date_end = date_end;
    }

    public int getPromotion_id() {
        return promotion_id;
    }

    public void setPromotion_id(int promotion_id) {
        this.promotion_id = promotion_id;
    }

    public String getPromotion_name() {
        return promotion_name;
    }

    public void setPromotion_name(String promotion_name) {
        this.promotion_name = promotion_name;
    }

    public Date getDate_start() {
        return date_start;
    }

    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    @Override
    public String toString() {
        return "PROMOTIONS_DW{" +
                "promotion_id=" + promotion_id +
                ", promotion_name='" + promotion_name + '\'' +
                ", date_start=" + date_start +
                ", date_end=" + date_end +
                '}';
    }
}
