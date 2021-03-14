package com.topicisp.salon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.topicisp.salon.model.APPOINTMENTS;
import com.topicisp.salon.model.STAFF;
import com.topicisp.salon.repository.AppointmentsRepository;
import com.topicisp.salon.service.MainService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AppointmentsTests {
    @InjectMocks
    private MainService mainService;

    @Mock
    private AppointmentsRepository appointmentsRepository;

    @Test
    @DisplayName("Retrieve all appointments")
    public void getAppointmentsTest() {
        Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date();
        Date date4 = java.util.Calendar.getInstance().getTime();
        //arrange
        when(appointmentsRepository.getProgr()).thenReturn(
                Arrays.asList(new APPOINTMENTS(111000,1, date1, "2pm"),
                        new APPOINTMENTS(111001,45, date2, "5pm"),
                        new APPOINTMENTS(111002,33, date4, "1pm"))
        );

        //act
        List<APPOINTMENTS> result = mainService.getProgr();

        //assert
        APPOINTMENTS app = result.get(1);
        assertEquals(app.getAppointment_id(), 111001);
        assertEquals(app.getClient_id(), 45);
        assertEquals(app.getAppointment_date(), date2);
        assertEquals(app.getAppointment_time(), "5pm");
    }

    @Test
    @DisplayName("Add new appointment")
    public void addAppointmentTest() {
        //arrange
        Date date1 = new Date();
        APPOINTMENTS app = new APPOINTMENTS(111000,1, date1, "2pm");
        when(appointmentsRepository.adaugaProgr(app)).thenReturn(List.of(app));

        //act
        List<APPOINTMENTS> result = mainService.adaugaProgr(app);

        //assert
        APPOINTMENTS addedApp = result.get(result.size() - 1);
        assertEquals(app.getClient_id(), addedApp.getClient_id());
        assertEquals(app.getAppointment_date(), addedApp.getAppointment_date());
        assertEquals(app.getAppointment_time(), addedApp.getAppointment_time());
    }

    @Test
    @DisplayName("Update appointment")
    public void updateAppointmentTest() {
        //arrange
        Date date1 = new Date();
        APPOINTMENTS app = new APPOINTMENTS(55,1, date1, "2pm");
        when(appointmentsRepository.updateProgr(app, 55)).thenReturn(List.of(app));

        //act
        List<APPOINTMENTS> result = mainService.updateProgr(app,55);

        //assert
        APPOINTMENTS updatedApp = result.get(result.size() - 1);
        assertEquals(app.getClient_id(), updatedApp.getClient_id());
        assertEquals(app.getAppointment_date(), updatedApp.getAppointment_date());
        assertEquals(app.getAppointment_time(), updatedApp.getAppointment_time());
    }


    @Test
    @DisplayName("Delete appointment")
    public void deleteAppointmentTest() {
        //arrange
        Date date1 = new Date();
        APPOINTMENTS app1 = new APPOINTMENTS(55,1, date1, "2pm");
        //act
        List<APPOINTMENTS> result = appointmentsRepository.stergeProgr(55);

        //verify
        verify(appointmentsRepository, times(1)).stergeProgr(eq(55));

    }

}