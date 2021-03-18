package com.topicisp.salon.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.topicisp.salon.model.CLIENTS;
import com.topicisp.salon.query.Querys;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClientsRepository {
    private static List<CLIENTS> clients = new ArrayList<>();

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<CLIENTS> getClients() {
        return jdbcTemplate.query(Querys.GET_CLIENTS_SQL, new BeanPropertyRowMapper<>(CLIENTS.class));
    }

    public List<CLIENTS> adaugaClient(CLIENTS s) {
        jdbcTemplate.update(Querys.ADAUGA_CLIENT, s.getAge_category_id(), s.getClient_first_name(), s.getClient_last_name(), s.getClient_gender(), s.getClient_address(), s.getClient_cell_phone(), s.getClient_email());
        jdbcTemplate.update(Querys.ADAUGA_CLIENT_DW, s.getAge_category_id(), s.getAge_category_id(), s.getClient_first_name(), s.getClient_last_name(), s.getClient_gender(), s.getClient_address(), s.getClient_cell_phone(), s.getClient_email());
        return getClients();
    }

    public List<CLIENTS> updateClient(CLIENTS s, int id) {
        jdbcTemplate.update(Querys.UPDATE_CLIENT,s.getAge_category_id(), s.getClient_first_name(), s.getClient_last_name(), s.getClient_gender(), s.getClient_address(), s.getClient_cell_phone(), s.getClient_email(), id);
        jdbcTemplate.update(Querys.UPDATE_CLIENT_DW, s.getAge_category_id(), s.getAge_category_id(), s.getClient_first_name(), s.getClient_last_name(), s.getClient_gender(), s.getClient_address(), s.getClient_cell_phone(), s.getClient_email(), id);
        return getClients();
    }

    public List<CLIENTS> stergeClient(int id) {
        jdbcTemplate.update(Querys.STERGE_CLIENT, id);
        jdbcTemplate.update(Querys.STERGE_CLIENT_DW, id);
        return getClients();
    }
}