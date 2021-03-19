package com.topicisp.salon.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.topicisp.salon.model.*;
import com.topicisp.salon.query.Querys;

import java.util.List;

@Repository
public class DepozitRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<CLIENTS_DW> getClientsDw() {
        return jdbcTemplate.query(Querys.GET_CLIENTS_DW_SQL, new BeanPropertyRowMapper<>(CLIENTS_DW.class));
    }

    public List<PAYMENTS_DW> getPaymentsDw() {
        return jdbcTemplate.query(Querys.GET_PAYMENTS_DW_SQL, new BeanPropertyRowMapper<>(PAYMENTS_DW.class));
    }

    public List<PROMOTIONS_DW> getPromoDw() {
        return jdbcTemplate.query(Querys.GET_PROMOTIONS_DW_SQL, new BeanPropertyRowMapper<>(PROMOTIONS_DW.class));
    }

    public List<SALON_SERVICES_DW> getSalServDw() {
        return jdbcTemplate.query(Querys.GET_SALON_SERVICES_DW_SQL, new BeanPropertyRowMapper<>(SALON_SERVICES_DW.class));
    }

    public List<SERVICES_VALUE_DW> getServValueDw() {
        return jdbcTemplate.query(Querys.GET_SERVICES_VALUE_DW_SQL, new BeanPropertyRowMapper<>(SERVICES_VALUE_DW.class));
    }

    public List<STAFF_DW> getStaffDw() {
        return jdbcTemplate.query(Querys.GET_STAFF_DW_SQL, new BeanPropertyRowMapper<>(STAFF_DW.class));
    }

    public List<STAFF_JOB_TITLE_DW> getJobsDw() {
        return jdbcTemplate.query(Querys.GET_STAFF_JOB_TITLE_DW_SQL, new BeanPropertyRowMapper<>(STAFF_JOB_TITLE_DW.class));
    }

    public List<TIMP_DW> getTimpDw() {
        return jdbcTemplate.query(Querys.GET_TIMP_DW_SQL, new BeanPropertyRowMapper<>(TIMP_DW.class));
    }


}