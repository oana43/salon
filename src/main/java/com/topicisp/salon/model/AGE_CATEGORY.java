package com.topicisp.salon.model;

public class AGE_CATEGORY {
    private int age_category_id;
    private String age_category_name;
    private int age_discount;

    public AGE_CATEGORY() {
    }

    public AGE_CATEGORY(int age_category_id, String age_category_name, int age_discount) {
        this.age_category_id = age_category_id;
        this.age_category_name = age_category_name;
        this.age_discount = age_discount;
    }

    public int getAge_category_id() {
        return age_category_id;
    }

    public void setAge_category_id(int age_category_id) {
        this.age_category_id = age_category_id;
    }

    public String getAge_category_name() {
        return age_category_name;
    }

    public void setAge_category_name(String age_category_name) {
        this.age_category_name = age_category_name;
    }

    public int getAge_discount() {
        return age_discount;
    }

    public void setAge_discount(int age_discount) {
        this.age_discount = age_discount;
    }

    @Override
    public String toString() {
        return "AGE_CATEGORY{" +
                "age_category_id=" + age_category_id +
                ", age_category_name='" + age_category_name + '\'' +
                ", age_discount=" + age_discount +
                '}';
    }
}
