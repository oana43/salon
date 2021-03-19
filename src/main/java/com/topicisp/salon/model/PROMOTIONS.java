package com.topicisp.salon.model;

import java.util.Date;

public class PROMOTIONS {
    private int promotion_id;
    private String promotion_name;
    private String promotion_discount;
    private Date date_start;
    private Date date_end;

    public PROMOTIONS() {}

    public PROMOTIONS(int promotion_id, String promotion_name, String promotion_discount, Date date_start, Date date_end) {
        this.promotion_id = promotion_id;
        this.promotion_name = promotion_name;
        this.promotion_discount = promotion_discount;
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

    public String getPromotion_discount() {
        return promotion_discount;
    }

    public void setPromotion_discount(String promotion_discount) {
        this.promotion_discount = promotion_discount;
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
        return "PROMOTIONS{" +
                "promotion_id=" + promotion_id +
                ", promotion_name='" + promotion_name + '\'' +
                ", promotion_discount='" + promotion_discount + '\'' +
                ", date_start=" + date_start +
                ", date_end=" + date_end +
                '}';
    }
}
