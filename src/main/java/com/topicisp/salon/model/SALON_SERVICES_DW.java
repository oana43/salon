package com.topicisp.salon.model;

public class SALON_SERVICES_DW {
    private int salon_service_id;
    private String salon_service_name;
    private int salon_service_subcategory_id;
    private String subcategory_name;
    private int salon_service_category_id;
    private String category_name;

    public SALON_SERVICES_DW() {
    }

    public SALON_SERVICES_DW(int salon_service_id, String salon_service_name, int salon_service_subcategory_id, String subcategory_name, int salon_service_category_id, String category_name) {
        this.salon_service_id = salon_service_id;
        this.salon_service_name = salon_service_name;
        this.salon_service_subcategory_id = salon_service_subcategory_id;
        this.subcategory_name = subcategory_name;
        this.salon_service_category_id = salon_service_category_id;
        this.category_name = category_name;
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

    public int getSalon_service_subcategory_id() {
        return salon_service_subcategory_id;
    }

    public void setSalon_service_subcategory_id(int salon_service_subcategory_id) {
        this.salon_service_subcategory_id = salon_service_subcategory_id;
    }

    public String getSubcategory_name() {
        return subcategory_name;
    }

    public void setSubcategory_name(String subcategory_name) {
        this.subcategory_name = subcategory_name;
    }

    public int getSalon_service_category_id() {
        return salon_service_category_id;
    }

    public void setSalon_service_category_id(int salon_service_category_id) {
        this.salon_service_category_id = salon_service_category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    @Override
    public String toString() {
        return "SALON_SERVICES_DW{" +
                "salon_service_id=" + salon_service_id +
                ", salon_service_name='" + salon_service_name + '\'' +
                ", salon_service_subcategory_id=" + salon_service_subcategory_id +
                ", subcategory_name='" + subcategory_name + '\'' +
                ", salon_service_category_id=" + salon_service_category_id +
                ", category_name='" + category_name + '\'' +
                '}';
    }
}
