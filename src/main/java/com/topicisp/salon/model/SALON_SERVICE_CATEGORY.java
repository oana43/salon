package com.topicisp.salon.model;

public class SALON_SERVICE_CATEGORY {
    private int salon_service_category_id;
    private String category_name;
    private String category_description;

    public SALON_SERVICE_CATEGORY() {}

    public SALON_SERVICE_CATEGORY(int salon_service_category_id, String category_name, String category_description) {
        this.salon_service_category_id = salon_service_category_id;
        this.category_name = category_name;
        this.category_description = category_description;
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

    public String getCategory_description() {
        return category_description;
    }

    public void setCategory_description(String category_description) {
        this.category_description = category_description;
    }

    @Override
    public String toString() {
        return "SALON_SERVICE_CATEGORY{" +
                "salon_service_category_id=" + salon_service_category_id +
                ", category_name='" + category_name + '\'' +
                ", category_description='" + category_description + '\'' +
                '}';
    }
}
