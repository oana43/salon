package com.topicisp.salon.repository;

import com.topicisp.salon.model.SALON_SERVICES;
import com.topicisp.salon.query.Querys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class SalServicesRepository {
    private static List<SALON_SERVICES> services = new ArrayList<>();

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<SALON_SERVICES> getSalServices() {
        return jdbcTemplate.query(Querys.GET_SALON_SERVICES_SQL, new BeanPropertyRowMapper<>(SALON_SERVICES.class));
    }

    public List<SALON_SERVICES> adaugaSalServ(SALON_SERVICES s, int idJob, double extra) {
        jdbcTemplate.update(Querys.ADAUGA_SALSERV, s.getSalon_service_name(), s.getSalon_service_description(), s.getSalon_standard_price(), s.getSalon_service_subcategory_id(), s.getPromotion_id());
        jdbcTemplate.update(Querys.ADAUGA_CHARGE_AMOUNT, idJob, extra);
        jdbcTemplate.update(Querys.ADAUGA_SALSERV_DW, s.getSalon_service_name(), s.getSalon_service_subcategory_id(), s.getSalon_service_subcategory_id(), s.getSalon_service_subcategory_id(), s.getSalon_service_subcategory_id());
        return getSalServices();
    }

    public List<SALON_SERVICES> updateSalServ(SALON_SERVICES s, int id) {
        jdbcTemplate.update(Querys.UPDATE_SALSERV, s.getSalon_service_name(), s.getSalon_service_description(), s.getSalon_standard_price(), s.getSalon_service_subcategory_id(), s.getPromotion_id(), id);
        jdbcTemplate.update(Querys.UPDATE_SALSERV_DW, s.getSalon_service_name(), s.getSalon_service_subcategory_id(), s.getSalon_service_subcategory_id(), s.getSalon_service_subcategory_id(), s.getSalon_service_subcategory_id(), id);
        return getSalServices();
    }

    public List<SALON_SERVICES> stergeSalServ(int id) {
        jdbcTemplate.update(Querys.STERGE_CHARGE_AMOUNT, id);
        jdbcTemplate.update(Querys.STERGE_SALSERV_DW, id);
        jdbcTemplate.update(Querys.STERGE_SALSERV, id);
        return getSalServices();
    }
}

