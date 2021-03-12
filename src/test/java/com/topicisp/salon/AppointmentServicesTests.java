package com.topicisp.salon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
//import proiect_dw.proiect_dw.model.APPOINTMENT_SERVICES;
//import proiect_dw.proiect_dw.model.STAFF;
//import proiect_dw.proiect_dw.repository.AppServicesRepository;
//import proiect_dw.proiect_dw.service.MainService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AppointmentServicesTests {
    /*
    @InjectMocks
    private MainService mainService;

    @Mock
    private AppServicesRepository appServicesRepository;

    @Test
    @DisplayName("Retrieve all appointment services")
    public void getAppServTest() {
        //arrange
        when(appServicesRepository.getServ()).thenReturn(
                Arrays.asList(new APPOINTMENT_SERVICES(1001, 22, 8, 250.0),
                        new APPOINTMENT_SERVICES(1002, 67, 5, 140.0),
                        new APPOINTMENT_SERVICES(1003, 81, 3, 180.0))
        );

        //act
        List<APPOINTMENT_SERVICES> result = mainService.getServ();

        //assert
        APPOINTMENT_SERVICES appserv = result.get(0);
        assertEquals(appserv.getAppointment_id(), 1001);
        assertEquals(appserv.getSalon_service_id(), 22);
        assertEquals(appserv.getStaff_id(), 8);
        assertEquals(appserv.getService_price(), 250.0);
    }

    @Test
    @DisplayName("Add new appointment service")
    public void addAppServiceTest() {
        //arrange
        APPOINTMENT_SERVICES appServ = new APPOINTMENT_SERVICES(1002, 67, 5, 140.0);
        when(appServicesRepository.adaugaServ(appServ)).thenReturn(List.of(appServ));

        //act
        List<APPOINTMENT_SERVICES> result = mainService.adaugaServ(appServ);

        //assert
        APPOINTMENT_SERVICES addedServ = result.get(result.size() - 1);
        assertEquals(appServ.getAppointment_id(), addedServ.getAppointment_id());
        assertEquals(appServ.getSalon_service_id(), addedServ.getSalon_service_id());
        assertEquals(appServ.getStaff_id(), addedServ.getStaff_id());
        assertEquals(appServ.getService_price(), addedServ.getService_price());

    }

    @Test
    @DisplayName("Delete appointment services")
    public void stergeStaffTest() {
        //arrange
        APPOINTMENT_SERVICES appServ = new APPOINTMENT_SERVICES(1002, 67, 5, 140.0);

        //act
        List<APPOINTMENT_SERVICES> result = appServicesRepository.stergeServ(1002, 67, 5);

        //verify
        verify(appServicesRepository, times(1)).stergeServ(1002,67,5);

    }*/
}
