package com.topicisp.salon.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.topicisp.salon.model.*;
import com.topicisp.salon.query.Querys;

import java.util.List;

@Repository
public class OthersRepository {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    public List<SALON_SERVICE_CATEGORY> getCategories() {
//        return jdbcTemplate.query(Querys.GET_CAT_SQL, new BeanPropertyRowMapper<>(SALON_SERVICE_CATEGORY.class));
//    }
//
//    public List<SALON_SERVICE_SUBCATEGORY> getSubcategories() {
//        return jdbcTemplate.query(Querys.GET_SUBCAT_SQL, new BeanPropertyRowMapper<>(SALON_SERVICE_SUBCATEGORY.class));
//    }
//
//    public List<PROMOTIONS> getPromo() {
//        return jdbcTemplate.query(Querys.GET_PROMOTIONS_SQL, new BeanPropertyRowMapper<>(PROMOTIONS.class));
//    }
//
//    public List<STAFF_EXTRA_CHARGE> getExtraCharge() {
//        return jdbcTemplate.query(Querys.GET_EXTRA_CHARGE_SQL, new BeanPropertyRowMapper<>(STAFF_EXTRA_CHARGE.class));
//    }
//
//    public List<STAFF_JOB_TITLE> getJobs() {
//        return jdbcTemplate.query(Querys.GET_JOBS_SQL, new BeanPropertyRowMapper<>(STAFF_JOB_TITLE.class));
//    }
//
//    public List<AGE_CATEGORY> getAgeCat() {
//        return jdbcTemplate.query(Querys.GET_AGE_CAT_SQL, new BeanPropertyRowMapper<>(AGE_CATEGORY.class));
//    }
//
//    public List<PAYMENT_METHODS> getPayMet() {
//        return jdbcTemplate.query(Querys.GET_PAYMET_SQL, new BeanPropertyRowMapper<>(PAYMENT_METHODS.class));
//    }
//
//    public List<PAYMENTS> getPayment() {
//        return jdbcTemplate.query(Querys.GET_PAYMENT_SQL, new BeanPropertyRowMapper<>(PAYMENTS.class));
//    }



}
