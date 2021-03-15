package com.topicisp.salon.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.topicisp.salon.model.*;
import com.topicisp.salon.repository.*;

import java.util.List;

@Service
public class MainService {

    //    Staff
    @Autowired
    private StaffRepository staffRepository;

    public List<STAFF> getStaff() {
        return staffRepository.getStaff();
    }

    public List<STAFF> getStaffById(int id) {
        return staffRepository.getStaffById(id);
    }

    public List<STAFF> adaugaStaff(STAFF s) {
        return staffRepository.adaugaStaff(s);
    }

    public List<STAFF> updateStaff(STAFF s, int id) {
        return staffRepository.updateStaff(s, id);
    }

    public List<STAFF> stergeAngajat(int id) {
        return staffRepository.stergeAngajat(id);
    }


    //    Salon Services

    @Autowired
    private SalServicesRepository salServicesRepository;

    public List<SALON_SERVICES> getSalServices() {
        return salServicesRepository.getSalServices();
    }

    public List<SALON_SERVICES> adaugaSalServ(SALON_SERVICES s, int idJob, double extra) {
        return salServicesRepository.adaugaSalServ(s, idJob, extra);
    }

    public List<SALON_SERVICES> updateSalServ(SALON_SERVICES s, int id) {
        return salServicesRepository.updateSalServ(s, id);
    }

    public List<SALON_SERVICES> stergeSalServ(int id) {
        return salServicesRepository.stergeSalServ(id);
    }

    //    Appointments
    @Autowired
    private AppointmentsRepository appointmentsRepository;

    public List<APPOINTMENTS> getProgr() {
        return appointmentsRepository.getProgr();
    }

    public List<APPOINTMENTS> adaugaProgr(APPOINTMENTS p) {
        return appointmentsRepository.adaugaProgr(p);
    }

    public List<APPOINTMENTS> updateProgr(APPOINTMENTS p, int id) {
        return appointmentsRepository.updateProgr(p, id);
    }

    public List<APPOINTMENTS> stergeProgr(int id) {
        return appointmentsRepository.stergeProgr(id);
    }


    //Appoitment services
    @Autowired
    private AppServicesRepository appServicesRepository;

    public List<APPOINTMENT_SERVICES> getServ() {
        return appServicesRepository.getServ();

    }

    public List<APPOINTMENT_SERVICES> adaugaServ(APPOINTMENT_SERVICES p) {
        return appServicesRepository.adaugaServ(p);
    }

    public List<APPOINTMENT_SERVICES> stergeServ(int idApp, int idServ, int idStaff) {
    return appServicesRepository.stergeServ(idApp, idServ, idStaff);
    }


}