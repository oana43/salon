package com.topicisp.salon.repository;

import com.topicisp.salon.model.APPOINTMENT_SERVICES;
import com.topicisp.salon.query.Querys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class AppServicesRepository {
    private static List<APPOINTMENT_SERVICES> Serv = new ArrayList<>();

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<APPOINTMENT_SERVICES> getServ() {
        return jdbcTemplate.query(Querys.GET_serv_SQL, new BeanPropertyRowMapper<>(APPOINTMENT_SERVICES.class));
    }

    public List<APPOINTMENT_SERVICES> adaugaServ(APPOINTMENT_SERVICES p) {
        jdbcTemplate.update(Querys.ADAUGA_serv, p.getAppointment_id(), p.getSalon_service_id(), p.getStaff_id(), p.getSalon_service_id(), p.getSalon_service_id(), p.getStaff_id(), p.getSalon_service_id(), p.getSalon_service_id(), p.getSalon_service_id(), p.getStaff_id());
//        jdbcTemplate.update(Querys.Update_service_price, p.getSalon_service_id(), p.getSalon_service_id(), p.getStaff_id(), p.getSalon_service_id(), p.getSalon_service_id(), p.getSalon_service_id(), p.getStaff_id(), p.getAppointment_id(), p.getStaff_id(), p.getSalon_service_id());
        jdbcTemplate.update(Querys.UPDATE_PRETURI_PLATA, p.getAppointment_id(), p.getAppointment_id(), p.getAppointment_id(), p.getAppointment_id(), p.getAppointment_id());
        jdbcTemplate.update(Querys.ADAUGA_serv_dw, p.getAppointment_id(), p.getStaff_id(), p.getSalon_service_id(), p.getSalon_service_id());
        jdbcTemplate.update(Querys.UPDATE_PRETURI_PLATA, p.getAppointment_id(), p.getAppointment_id(), p.getAppointment_id(), p.getAppointment_id(), p.getAppointment_id());
        return getServ();
    }

    public List<APPOINTMENT_SERVICES> stergeServ(int idApp, int idServ, int idStaff) {
        jdbcTemplate.update(Querys.STERGE_serv, idApp, idServ, idStaff);
        jdbcTemplate.update(Querys.STERGE_serv_DW, idApp, idServ, idStaff);
        jdbcTemplate.update(Querys.UPDATE_PRETURI_PLATA, idApp, idApp, idApp, idApp, idApp);
        return getServ();
    }
}