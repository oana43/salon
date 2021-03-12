package com.topicisp.salon.model;


public class SALON_SERVICES {
    private int salon_service_id;
    private String salon_service_name;
    private String salon_service_description;
    private Double salon_standard_price;
    private int salon_service_subcategory_id;
    private int promotion_id;

    public SALON_SERVICES() {}

    public SALON_SERVICES(int salon_service_id, String salon_service_name, String salon_service_description, Double salon_standard_price, int salon_service_subcategory_id, int promotion_id) {
        this.salon_service_id = salon_service_id;
        this.salon_service_name = salon_service_name;
        this.salon_service_description = salon_service_description;
        this.salon_standard_price = salon_standard_price;
        this.salon_service_subcategory_id = salon_service_subcategory_id;
        this.promotion_id = promotion_id;
    }

    public int getSalon_service_id() {
        return salon_service_id;
    }

    public void setSalon_service_id(int salon_service_id) {
        this.salon_service_id = salon_service_id;
    }

    public String getSalon_service_name() {
        return salon_service_name;
    }

    public void setSalon_service_name(String salon_service_name) {
        this.salon_service_name = salon_service_name;
    }

    public String getSalon_service_description() {
        return salon_service_description;
    }

    public void setSalon_service_description(String salon_service_description) {
        this.salon_service_description = salon_service_description;
    }

    public Double getSalon_standard_price() {
        return salon_standard_price;
    }

    public void setSalon_standard_price(Double salon_standard_price) {
        this.salon_standard_price = salon_standard_price;
    }

    public int getSalon_service_subcategory_id() {
        return salon_service_subcategory_id;
    }

    public void setSalon_service_subcategory_id(int salon_service_subcategory_id) {
        this.salon_service_subcategory_id = salon_service_subcategory_id;
    }

    public int getPromotion_id() {
        return promotion_id;
    }

    public void setPromotion_id(int promotion_id) {
        this.promotion_id = promotion_id;
    }

    @Override
    public String toString() {
        return "SALON_SERVICES{" +
                "salon_service_id=" + salon_service_id +
                ", salon_service_name='" + salon_service_name + '\'' +
                ", salon_service_description='" + salon_service_description + '\'' +
                ", salon_standard_price=" + salon_standard_price +
                ", salon_service_subcategory_id=" + salon_service_subcategory_id +
                ", promotion_id=" + promotion_id +
                '}';
    }
}

