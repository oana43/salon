package com.topicisp.salon.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;
import com.topicisp.salon.model.APPOINTMENTS;
import com.topicisp.salon.query.Querys;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AppointmentsRepository {
    private static List<APPOINTMENTS> progr = new ArrayList<>();

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<APPOINTMENTS> getProgr() {
        return jdbcTemplate.query(Querys.GET_progr_SQL, new BeanPropertyRowMapper<>(APPOINTMENTS.class));
    }

    public List<APPOINTMENTS> adaugaProgr(APPOINTMENTS p) {
//        PreparedStatementCreator preparedStatementCreator = connection -> {
//            PreparedStatement preparedStatement = connection.prepareStatement(Querys.ADAUGA_progr, Statement.RETURN_GENERATED_KEYS);
//            preparedStatement.setInt(1, p.getClient_id());
//            preparedStatement.setDate(2, new java.sql.Date(p.getAppointment_date().getDate()));
//            preparedStatement.setString(3, p.getAppointment_time());
//            return preparedStatement;
//        };
//        GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();
//        jdbcTemplate.update(preparedStatementCreator, generatedKeyHolder);
        jdbcTemplate.update(Querys.ADAUGA_progr, p.getClient_id(), p.getAppointment_date(), p.getAppointment_time());
        jdbcTemplate.update(Querys.ADAUGA_PLATA);
        return getProgr();
    }

    public List<APPOINTMENTS> updateProgr(APPOINTMENTS p, int id) {
        jdbcTemplate.update(Querys.UPDATE_progr, p.getClient_id(), p.getAppointment_date(), p.getAppointment_time() , id);
        jdbcTemplate.update(Querys.UPDATE_progr_DW, p.getClient_id(), p.getAppointment_date(), id);
        return getProgr();
    }

    public List<APPOINTMENTS> stergeProgr(int id) {
        jdbcTemplate.update(Querys.STERGE_progr_serv, id);
        jdbcTemplate.update(Querys.STERGE_plata, id);
        jdbcTemplate.update(Querys.STERGE_progr, id);
        jdbcTemplate.update(Querys.STERGE_progr_DW, id);
        return getProgr();
    }
}
