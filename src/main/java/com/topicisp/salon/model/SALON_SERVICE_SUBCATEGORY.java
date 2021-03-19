package com.topicisp.salon.model;

public class SALON_SERVICE_SUBCATEGORY {
    private int salon_service_subcategory_id;
    private int salon_service_category_id;
    private String subcategory_name;
    private String subcategory_description;

    public SALON_SERVICE_SUBCATEGORY() {}

    public SALON_SERVICE_SUBCATEGORY(int salon_service_subcategory_id, int salon_service_category_id, String subcategory_name, String subcategory_description) {
        this.salon_service_subcategory_id = salon_service_subcategory_id;
        this.salon_service_category_id = salon_service_category_id;
        this.subcategory_name = subcategory_name;
        this.subcategory_description = subcategory_description;
    }

    public int getSalon_service_subcategory_id() {
        return salon_service_subcategory_id;
    }

    public void setSalon_service_subcategory_id(int salon_service_subcategory_id) {
        this.salon_service_subcategory_id = salon_service_subcategory_id;
    }

    public int getSalon_service_category_id() {
        return salon_service_category_id;
    }

    public void setSalon_service_category_id(int salon_service_category_id) {
        this.salon_service_category_id = salon_service_category_id;
    }

    public String getSubcategory_name() {
        return subcategory_name;
    }

    public void setSubcategory_name(String subcategory_name) {
        this.subcategory_name = subcategory_name;
    }

    public String getSubcategory_description() {
        return subcategory_description;
    }

    public void setSubcategory_description(String subcategory_description) {
        this.subcategory_description = subcategory_description;
    }

    @Override
    public String toString() {
        return "SALON_SERVICE_SUBCATEGORY{" +
                "salon_service_subcategory_id=" + salon_service_subcategory_id +
                ", salon_service_category_id=" + salon_service_category_id +
                ", subcategory_name='" + subcategory_name + '\'' +
                ", subcategory_description='" + subcategory_description + '\'' +
                '}';
    }
}
