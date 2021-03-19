package com.topicisp.salon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.topicisp.salon.model.SALON_SERVICES;
import com.topicisp.salon.model.STAFF;
import com.topicisp.salon.repository.AppServicesRepository;
import com.topicisp.salon.repository.SalServicesRepository;
import com.topicisp.salon.repository.StaffRepository;
import com.topicisp.salon.service.MainService;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SalonServicesTests {

    @InjectMocks
    private MainService mainService;

    @Mock
    private SalServicesRepository salServicesRepository;

    @Test
    @DisplayName("Retrieve all salon services")
    public void getSalonServicesTest() {
        //arrange
        when(salServicesRepository.getSalServices()).thenReturn(
                Arrays.asList(new SALON_SERVICES(1,"Serviciu1", "Descriere1", 20.00, 2, 3),
                        new SALON_SERVICES(2,"Serviciu2", "Descriere2",80.00, 2, 1),
                        new SALON_SERVICES(3,"Serviciu3", "Descriere3",60.00, 5, 2))
        );

        //act
        List<SALON_SERVICES> result = mainService.getSalServices();

        //assert
        SALON_SERVICES salon_services = result.get(0);
        assertEquals(salon_services.getSalon_service_id(), 1);
        assertEquals(salon_services.getSalon_service_name(), "Serviciu1");
        assertEquals(salon_services.getSalon_service_description(), "Descriere1");
        assertEquals(salon_services.getSalon_service_subcategory_id(), 2);
        assertEquals(salon_services.getSalon_standard_price(), 20);
        assertEquals(salon_services.getPromotion_id(), 3);
    }

    @Test
    @DisplayName("Add new salon service")
    public void adaugaSalonServiceTest() {
        //arrange
        SALON_SERVICES service = new SALON_SERVICES(1,"Serviciu1", "Descriere1", 20.00, 2, 3);
        Integer id_job = 20;
        Double extra_charge = 25.00;
        when(salServicesRepository.adaugaSalServ(service, id_job, extra_charge)).thenReturn(List.of(service));

        //act
        List<SALON_SERVICES> result = mainService.adaugaSalServ(service, id_job, extra_charge);

        //assert
        SALON_SERVICES newService = result.get(result.size() - 1);
        assertEquals(service.getSalon_service_id(), newService.getSalon_service_id());
        assertEquals(service.getSalon_service_name(), newService.getSalon_service_name());
        assertEquals(service.getSalon_service_description(), newService.getSalon_service_description());
        assertEquals(service.getSalon_service_subcategory_id(), newService.getSalon_service_subcategory_id());
        assertEquals(service.getSalon_standard_price(), newService.getSalon_standard_price());
        assertEquals(service.getPromotion_id(), newService.getPromotion_id());
    }

    @Test
    @DisplayName("Update salon service")
    public void updateSalonServiceTest() {
        //arrange
        SALON_SERVICES service = new SALON_SERVICES(10,"Serviciu1", "Descriere1", 20.00, 2, 3);
        when(salServicesRepository.updateSalServ(service, 10)).thenReturn(List.of(service));

        //act
        List<SALON_SERVICES> result = mainService.updateSalServ(service,10);

        //assert
        SALON_SERVICES updatedService = result.get(result.size() - 1);
        assertEquals(updatedService.getSalon_service_id(), 10);
        assertEquals(updatedService.getSalon_service_name(), "Serviciu1");
        assertEquals(updatedService.getSalon_service_description(), "Descriere1");
        assertEquals(updatedService.getSalon_service_subcategory_id(), 2);
        assertEquals(updatedService.getSalon_standard_price(), 20.00);
        assertEquals(updatedService.getPromotion_id(), 3);
    }


    @Test
    @DisplayName("Delete salon service")
    public void stergeSalonServiceTest() {
        //arrange
        SALON_SERVICES service = new SALON_SERVICES(10,"Serviciu1", "Descriere1", 20.00, 2, 3);

        //act
        List<SALON_SERVICES> result = salServicesRepository.stergeSalServ(10);

        //verify
        verify(salServicesRepository, times(1)).stergeSalServ(eq(10));

    }

}
