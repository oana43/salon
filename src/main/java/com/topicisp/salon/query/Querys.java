package com.topicisp.salon.query;

public class Querys {
    //Staff
    public final static String GET_STAFF_SQL = "select * from user_OLTP_dw.staff order by staff_id desc";
    public final static String ADAUGA_STAFF = "insert into user_OLTP_dw.staff(staff_id, job_id, staff_name, base_salary) values ((select max(staff_id) from user_OLTP_dw.staff ) + 1, ?, ?, ?)";
    public final static String FIND_STAFF_BY_ID = "select * from user_OLTP_dw.staff where staff_id = ?";

    public final static String ADAUGA_STAFF_DW = "insert into user_depozit_dw.staff_dw(staff_id, job_id, job_title, staff_name, base_salary) values ((select max(staff_id) from user_depozit_dw.staff_dw) + 1, ?, (select job_name \n" +
            "from user_OLTP_dw.staff_job_title j\n" +
            "where j.job_id = ?) , ?, ?)";
    public final static String UPDATE_STAFF = "update user_OLTP_dw.staff set job_id = ?, staff_name = ?, base_salary = ? where staff_id = ?";
    public final static String UPDATE_STAFF_DW = "update user_depozit_dw.staff_dw set job_id = ?, job_title = (select job_name \n" +
            "from user_OLTP_dw.staff_job_title j\n" +
            "where j.job_id = ?), staff_name = ?, base_salary = ?  where staff_id = ?";
    public final static String STERGE_ANGAJAT = "delete from user_OLTP_dw.staff where staff_id = ?";
    public final static String STERGE_ANGAJAT_DW = "delete from user_depozit_dw.staff_dw where staff_id = ?";

    //Clients
    public final static String GET_CLIENTS_SQL = "select * from user_OLTP_dw.clients order by client_id desc";
    public final static String ADAUGA_CLIENT = "insert into user_OLTP_dw.clients values ((select max(client_id) from user_OLTP_dw.clients ) + 1, ?, ?, ?, ?, ?, ?, ?)";
    public final static String ADAUGA_CLIENT_DW = "insert into user_depozit_dw.clients_dw\n" +
            "values ((select max(client_id) from user_depozit_dw.clients_dw) + 1, ?, (select age_category_name\n" +
            "from user_OLTP_dw.age_category a\n" +
            "where a.age_category_id = ?) , ?, ?, ?, ?, ?, ?)";
    public final static String UPDATE_CLIENT = "update user_OLTP_dw.clients set age_category_id= ?, client_first_name = ?, client_last_name = ?, \n" +
            "client_gender = ?, client_address = ?, client_cell_phone = ?, client_email = ?\n" +
            "where client_id = ?";
    public final static String UPDATE_CLIENT_DW = "update user_depozit_dw.clients_dw set client_age_category_id= ?, age_category_name = (select age_category_name\n" +
            "from user_OLTP_dw.age_category a where a.age_category_id = ?), client_first_name = ?, client_last_name = ?, \n" +
            "client_gender = ?, client_address = ?, client_cell_phone = ?, client_email = ? where client_id = ?";
    public final static String STERGE_CLIENT = "delete from user_OLTP_dw.clients where client_id = ?";
    public final static String STERGE_CLIENT_DW = "delete from user_depozit_dw.clients_dw where client_id = ?";

    //Salon Services
    public final static String GET_SALON_SERVICES_SQL = "select * from user_OLTP_dw.salon_services order by salon_service_id desc";
    public final static String ADAUGA_SALSERV = "insert into user_OLTP_dw.salon_services values ((select max(salon_service_id) from user_OLTP_dw.salon_services) + 1, ?, ?, ?, ?, ?)";
    public final static String ADAUGA_CHARGE_AMOUNT = "insert into user_OLTP_dw.staff_extra_charge values (?, (select max(salon_service_id) from user_OLTP_dw.staff_extra_charge) + 1, ?)";
    public final static String ADAUGA_SALSERV_DW = "insert into user_depozit_dw.salon_services_dw values ((select max(salon_service_id) from user_depozit_dw.salon_services_dw) + 1, ?, ?, \n" +
            "(select subcategory_name from user_OLTP_dw.salon_service_subcategory where salon_service_subcategory_id = ?),\n" +
            "(select salon_service_category_id from user_OLTP_dw.salon_service_subcategory where salon_service_subcategory_id = ?),\n" +
            "(select category_name from user_OLTP_dw.salon_service_subcategory s, user_OLTP_dw.salon_service_category c\n" +
            "where s.salon_service_category_id = c.salon_service_category_id\n" +
            "and s.salon_service_subcategory_id = ?)\n" +
            ")";
    public final static String UPDATE_SALSERV = "update user_OLTP_dw.salon_services set SALON_SERVICE_NAME = ?, SALON_SERVICE_DESCRIPTION = ?, SALON_STANDARD_PRICE = ?,\n" +
            "SALON_SERVICE_SUBCATEGORY_ID = ?, PROMOTION_ID = ? where SALON_SERVICE_ID = ?";
    public final static String UPDATE_SALSERV_DW = "update user_depozit_dw.salon_services_dw set SALON_SERVICE_NAME = ?, SALON_SERVICE_SUBCATEGORY_ID = ?, \n" +
            "subcategory_name = (select subcategory_name from user_OLTP_dw.salon_service_subcategory where salon_service_subcategory_id = ?),\n" +
            "salon_service_category_id = (select salon_service_category_id from user_OLTP_dw.salon_service_subcategory where salon_service_subcategory_id = ?),\n" +
            "category_name = (select category_name from user_OLTP_dw.salon_service_subcategory s, user_OLTP_dw.salon_service_category c\n" +
            "where s.salon_service_category_id = c.salon_service_category_id\n" +
            "and s.salon_service_subcategory_id = ?)\n" +
            "where SALON_SERVICE_ID = ?";
    public final static String STERGE_SALSERV = "delete from user_OLTP_dw.salon_services where SALON_SERVICE_ID = ?";
    public final static String STERGE_SALSERV_DW = "delete from user_depozit_dw.salon_services_dw where SALON_SERVICE_ID = ?";
    public final static String STERGE_CHARGE_AMOUNT = "delete from user_OLTP_dw.staff_extra_charge where SALON_SERVICE_ID = ?";

    //Appointments
    public final static String GET_progr_SQL = "select * from (select * from user_OLTP_dw.appointments order by appointment_id desc) where rownum<1001";
    public final static String ADAUGA_progr = "insert into user_OLTP_dw.appointments(appointment_id, client_id, appointment_date, appointment_time) values ((select max(appointment_id) from user_OLTP_dw.appointments ) + 1, ?, ?, ?)";
    public final static String UPDATE_progr = "update user_OLTP_dw.appointments set client_id = ?, appointment_date = ?, appointment_time = ? where appointment_id = ?";
    public final static String UPDATE_progr_DW = "update user_depozit_dw.services_value_dw set client_id = ?, appointment_date = ?  where appointment_id = ?";
    public final static String STERGE_progr = "delete from user_OLTP_dw.appointments where appointment_id = ?";
    public final static String STERGE_progr_serv = "delete from user_OLTP_dw.appointment_services where appointment_id = ?";
    public final static String STERGE_plata = "delete from user_OLTP_dw.payments where appointment_id = ?";
    public final static String STERGE_progr_DW = "delete from user_depozit_dw.services_value_dw where appointment_id = ?";

    //Appointment Services
    public final static String GET_serv_SQL = "select * from (select * from user_OLTP_dw.appointment_services order by appointment_id desc) where rownum<1001";
//    public final static String ADAUGA_serv = "insert into user_OLTP_dw.appointment_services(appointment_id, salon_service_id, staff_id, service_price) values (?, ?, ?, ?)";
    public final static String ADAUGA_serv = "insert into user_OLTP_dw.appointment_services(appointment_id, salon_service_id, staff_id, service_price) values (?, ?, ?, (select salon_standard_price from user_OLTP_dw.SALON_SERVICES where salon_service_id = ?)\n" +
        "+\n" +
        "(select charge_amount from user_OLTP_dw.STAFF_EXTRA_CHARGE where salon_service_id = ? and job_id = (select job_id from user_OLTP_dw.STAFF st where st.staff_id = ?))\n" +
        "- trunc(\n" +
        "(select promotion_discount from user_OLTP_dw.PROMOTIONS a, user_OLTP_dw.salon_services b\n" +
        "where a.promotion_id = b.promotion_id and b.salon_service_id = ?)\n" +
        "*(\n" +
        "(select salon_standard_price from user_OLTP_dw.SALON_SERVICES where salon_service_id = ?)\n" +
        "+(select charge_amount from user_OLTP_dw.STAFF_EXTRA_CHARGE where salon_service_id = ?\n" +
        "and job_id = (select job_id from user_OLTP_dw.STAFF st where st.staff_id = ?)))/100, 2)\n" +
        ")";
    public final static String Update_service_price =
            "update user_OLTP_dw.appointment_services\n" +
                    "set service_price  = \n" +
                    "(select salon_standard_price from user_OLTP_dw.SALON_SERVICES where salon_service_id = ?)\n" +
                    "+ \n" +
                    "(select charge_amount from user_OLTP_dw.STAFF_EXTRA_CHARGE where salon_service_id = ? and job_id = (select job_id from user_OLTP_dw.STAFF st where st.staff_id = ?))\n" +
                    "- trunc(\n" +
                    "(select promotion_discount from user_OLTP_dw.PROMOTIONS a, user_OLTP_dw.salon_services b\n" +
                    "where a.promotion_id = b.promotion_id and b.salon_service_id = ?)\n" +
                    "*(\n" +
                    "(select salon_standard_price from user_OLTP_dw.SALON_SERVICES\twhere salon_service_id = ?)\n" +
                    "+(select charge_amount from user_OLTP_dw.STAFF_EXTRA_CHARGE where salon_service_id = ?\n" +
                    "and job_id = (select job_id from user_OLTP_dw.STAFF st where st.staff_id = ?)))/100, 2)\n" +
                    " where appointment_id = ?  and staff_id = ? and salon_service_id = ?";
    public final static String ADAUGA_serv_dw = "insert into user_depozit_dw.services_value_dw \n" +
            "(select (select max(service_value_id) from user_depozit_dw.services_value_dw ) + 1,\n" +
            " a.client_id, s.salon_service_id, s.staff_id, st.job_id, a.appointment_date, payment_id, serv.promotion_id, a.appointment_id,\n" +
            "age_discount, promotion_discount, (extra.charge_amount + serv.salon_standard_price), trunc(s.service_price - promotion_discount*s.service_price/100, 2)\n" +
            "from user_OLTP_dw.appointments a, user_OLTP_dw.appointment_services s, user_OLTP_dw.staff st, \n" +
            "user_OLTP_dw.payments p, user_OLTP_dw.salon_services serv, user_OLTP_dw.clients cli,\n" +
            "user_OLTP_dw.age_category age, user_OLTP_dw.promotions promo, user_OLTP_dw.staff_extra_charge extra\n" +
            "where a.appointment_id = ?\n" +
            "and st.staff_id = s.staff_id\n" +
            "and s.staff_id = ?\n" +
            "and a.appointment_id = p.appointment_id\n" +
            "and serv.salon_service_id = s.salon_service_id\n" +
            "and s.salon_service_id = ?\n" +
            "and a.client_id = cli.client_id\n" +
            "and cli.age_category_id = age.age_category_id\n" +
            "and serv.promotion_id = promo.promotion_id\n" +
            "and extra.job_id = st.job_id\n" +
            "and extra.salon_service_id =s.salon_service_id\n" +
            "and s.salon_service_id = ?\n" +
            "and rownum<2\n" +
            ")";

    public final static String ADAUGA_PLATA = "insert into user_OLTP_dw.payments values ((select max(payment_id) from user_OLTP_dw.payments ) + 1, (select max(appointment_id) from user_OLTP_dw.payments ) + 1, 3, 0, 0)";
    public final static String UPDATE_PRETURI_PLATA = "update user_OLTP_dw.payments set total_price = (select sum(service_price) from user_OLTP_dw.appointment_services\n" +
            "where appointment_id = ? ), final_price = \n" +
            "(select sum(service_price) from user_OLTP_dw.appointment_services where appointment_id = ?)- \n" +
            "trunc((select age_discount from user_OLTP_dw.AGE_CATEGORY a, user_OLTP_dw.CLIENTS c, user_OLTP_dw.APPOINTMENTS ap\n" +
            "where  a.age_category_id = c.AGE_CATEGORY_ID\n" +
            "and c.CLIENT_ID = ap.CLIENT_ID \n" +
            "and ap.APPOINTMENT_ID = ?)\n" +
            "* (select sum(service_price) from user_OLTP_dw.appointment_services where appointment_id = ?)/100, 2)\n" +
            "where APPOINTMENT_ID = ?";
    public final static String STERGE_serv = "delete from user_OLTP_dw.appointment_services where appointment_id = ? and salon_service_id = ? and staff_id  = ?";
    public final static String STERGE_serv_DW = "delete from user_depozit_dw.services_value_dw where appointment_id = ? and salon_service_id = ? and staff_id  = ?";

    //    Others
    public final static String GET_CAT_SQL = "select * from user_OLTP_dw.salon_service_category";
    public final static String GET_SUBCAT_SQL = "select * from user_OLTP_dw.salon_service_subcategory";
    public final static String GET_PROMOTIONS_SQL = "select * from user_OLTP_dw.promotions";
    public final static String GET_EXTRA_CHARGE_SQL = "select * from user_OLTP_dw.staff_extra_charge order by salon_service_id desc";
    public final static String GET_JOBS_SQL = "select * from user_OLTP_dw.staff_job_title";
    public final static String GET_AGE_CAT_SQL = "select * from user_OLTP_dw.age_category";
    public final static String GET_PAYMET_SQL = "select * from user_OLTP_dw.payment_methods";
    public final static String GET_PAYMENT_SQL = "select * from (select * from user_OLTP_dw.payments order by payment_id desc) where rownum<1001";

    //    Depozit
    public final static String GET_CLIENTS_DW_SQL = "select * from user_depozit_dw.CLIENTS_DW order by client_id desc";
    public final static String GET_PAYMENTS_DW_SQL = "select * from (select * from user_depozit_dw.PAYMENTS_DW order by payment_id desc) where rownum<1001";
    public final static String GET_PROMOTIONS_DW_SQL = "select * from user_depozit_dw.PROMOTIONS_DW";
    public final static String GET_SALON_SERVICES_DW_SQL = "select * from user_depozit_dw.SALON_SERVICES_DW order by salon_service_id desc";
    public final static String GET_SERVICES_VALUE_DW_SQL = "select * from (select * from user_depozit_dw.SERVICES_VALUE_DW order by SERVICE_VALUE_ID desc) where rownum<1001";
    public final static String GET_STAFF_DW_SQL = "select * from user_depozit_dw.STAFF_DW order by staff_id desc";
    public final static String GET_STAFF_JOB_TITLE_DW_SQL = "select * from user_depozit_dw.STAFF_JOB_TITLE_DW";
    public final static String GET_TIMP_DW_SQL = "select * from user_depozit_dw.TIMP_DW";


}
