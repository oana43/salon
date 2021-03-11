package com.topicisp.salon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
//import proiect_dw.proiect_dw.model.STAFF;
//import proiect_dw.proiect_dw.repository.StaffRepository;
//import proiect_dw.proiect_dw.service.MainService;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StaffTests {
//    @InjectMocks
//    private MainService mainService;
//
//    @Mock
//    private StaffRepository staffRepository;
//
//    @Test
//    @DisplayName("Retrieve all staff memebers")
//    public void getStaffTest() {
//        //arrange
//        when(staffRepository.getStaff()).thenReturn(
//                Arrays.asList(new STAFF(99,1,"Dinu Ioana", 12000),
//                        new STAFF(100,3,"Marcel Pavel", 8000),
//                        new STAFF(101,2,"Bogdan Ionescu", 6000))
//        );
//
//        //act
//        List<STAFF> result = mainService.getStaff();
//
//        //assert
//        STAFF staff = result.get(1);
//        assertEquals(staff.getStaff_id(), 100);
//        assertEquals(staff.getJob_id(), 3);
//        assertEquals(staff.getStaff_name(), "Marcel Pavel");
//        assertEquals(staff.getBase_salary(), 8000);
//    }
//
//    @Test
//    @DisplayName("Add new staff memeber")
//    public void adaugaStaffTest() {
//        //arrange
//        STAFF staff = new STAFF(99,1,"Dinu Ioana", 12000);
//        when(staffRepository.adaugaStaff(staff)).thenReturn(List.of(staff));
//
//        //act
//        List<STAFF> result = mainService.adaugaStaff(staff);
//
//        //assert
//        STAFF addedStaff = result.get(result.size() - 1);
//        assertEquals(staff.getStaff_name(), addedStaff.getStaff_name());
//        assertEquals(staff.getJob_id(), addedStaff.getJob_id());
//        assertEquals(staff.getBase_salary(), addedStaff.getBase_salary());
//    }
//
//    @Test
//    @DisplayName("Update staff memeber")
//    public void updateStaffTest() {
//        //arrange
//        STAFF staff = new STAFF(99,1,"Dinu Ioana", 13000);
//        when(staffRepository.updateStaff(staff, 99)).thenReturn(List.of(staff));
//
//        //act
//        List<STAFF> result = mainService.updateStaff(staff,99);
//
//        //assert
//        STAFF updatedStaff = result.get(result.size() - 1);
//        assertEquals(staff.getStaff_name(), updatedStaff.getStaff_name());
//        assertEquals(staff.getJob_id(), updatedStaff.getJob_id());
//        assertEquals(staff.getBase_salary(), updatedStaff.getBase_salary());
//    }
//
//
//    @Test
//    @DisplayName("Delete staff memeber")
//    public void stergeStaffTest() {
//        //arrange
//        STAFF staff1 = new STAFF(99,1,"Dinu Ioana", 13000);
//
//        //act
//        List<STAFF> result = staffRepository.stergeAngajat(99);
//
//        //verify
//        verify(staffRepository, times(1)).stergeAngajat(eq(99));
//
//    }

}
