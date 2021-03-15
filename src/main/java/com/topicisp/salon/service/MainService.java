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
}