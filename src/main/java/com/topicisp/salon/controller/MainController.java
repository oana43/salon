package com.topicisp.salon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.topicisp.salon.model.*;
import com.topicisp.salon.service.MainService;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private MainService mainService;

    @GetMapping("/main")
    public String main(Model model) {
        return "index";
    }

    //    Staff
    @GetMapping("/main/getStaff")
    public String getStaff(Model model) {
        model.addAttribute("staffMembers", mainService.getStaff());
        return "getStaff";
    }

    @GetMapping("/main/getStaffById")
    public String getStaffById(int id, Model model) {
        model.addAttribute("staffMembers", mainService.getStaffById(id));
        return "getStaffById";
    }

    @PostMapping("/adaugaStaff")
    public String adaugaStaff(@RequestBody STAFF s, Model model) {
        mainService.adaugaStaff(s);
        model.addAttribute("staffMembers", mainService.getStaff());
        return "getStaff";
    }

    @PostMapping("/updateStaff")
    public String updateStaff(@RequestBody STAFF s, @RequestParam int id, Model model) {
        mainService.updateStaff(s, id);
        model.addAttribute("staffMembers", mainService.getStaff());
        return "getStaff";
    }

    @GetMapping("/stergeAngajat/{idStaff}")
    public String stergeAngajat(@PathVariable int idStaff, Model model) {
        mainService.stergeAngajat(idStaff);
        model.addAttribute("staffMembers", mainService.getStaff());
        return "getStaff";
    }

    //    Salon Services
    @GetMapping("/main/getSalServ")
    public String getSalServ(Model model) {
        model.addAttribute("SalonServices", mainService.getSalServices());
        return "getSalServ";
    }

    @PostMapping("/adaugaSalServ")
    public String adaugaSalServ(@RequestBody SALON_SERVICES s, @RequestParam int idJob, @RequestParam double extra, Model model) {
        mainService.adaugaSalServ(s, idJob, extra);
        model.addAttribute("SalonServices", mainService.getSalServices());
        return "getSalServ";
    }

    @PostMapping("/updateSalServ")
    public String updateSalServ(@RequestBody SALON_SERVICES s, @RequestParam int id, Model model) {
        mainService.updateSalServ(s, id);
        model.addAttribute("SalonServices", mainService.getSalServices());
        return "getSalServ";
    }

    @GetMapping("/stergeSalServ/{idSalServ}")
    public String stergeSalServ(@PathVariable int idSalServ, Model model) {
        mainService.stergeSalServ(idSalServ);
        model.addAttribute("SalonServices", mainService.getSalServices());
        return "getSalServ";
    }


//    Appointments

    @GetMapping("/main/getProgr")
    public String getProgr(Model model) {
        model.addAttribute("Programari", mainService.getProgr());
        return "getProgr";
    }

    @PostMapping("/adaugaProgr")
    public String adaugaProgr(@RequestBody APPOINTMENTS s, Model model) {
        mainService.adaugaProgr(s);
        model.addAttribute("Programari", mainService.getProgr());
        return "getProgr";
    }

    @PostMapping("/updateProgr")
    public String updateProgr(@RequestBody APPOINTMENTS s, @RequestParam int id, Model model) {
        mainService.updateProgr(s, id);
        model.addAttribute("Programari", mainService.getProgr());
        return "getProgr";
    }

    @GetMapping("/stergeProgr/{idProgr}")
    public String stergeProgr(@PathVariable int idProgr, Model model) {
        mainService.stergeProgr(idProgr);
        model.addAttribute("Programari", mainService.getProgr());
        return "getProgr";
    }

    //Appointment services
    @GetMapping("/main/getAppServ")
    public String getAppServ(Model model) {
        model.addAttribute("AppServices", mainService.getServ());
        return "getAppServ";
    }

    @PostMapping("/adaugaAppServ")
    public String adaugaAppServ(@RequestBody APPOINTMENT_SERVICES s, Model model) {
        mainService.adaugaServ(s);
        model.addAttribute("AppServices", mainService.getServ());
        return "getAppServ";
    }

    @GetMapping("/stergeAppServ/{idApp}/{idServ}/{idStaff}")
    public String stergeAppServ(@PathVariable("idApp") int idApp, @PathVariable("idServ") int idServ, @PathVariable("idStaff") int idStaff, Model model) {
        mainService.stergeServ(idApp, idServ, idStaff);
        model.addAttribute("AppServices", mainService.getServ());
        return "getAppServ";
    }

    //    Clients
    @GetMapping("/main/getClients")
    public String getClients(Model model) {
        model.addAttribute("Clients", mainService.getClients());
        return "getClients";
    }

    @PostMapping("/adaugaClient")
    public String adaugaClient(@RequestBody CLIENTS s, Model model) {
        mainService.adaugaClient(s);
        model.addAttribute("Clients", mainService.getClients());
        return "getClients";
    }

    @PostMapping("/updateClient")
    public String updateClient(@RequestBody CLIENTS s, @RequestParam int id, Model model) {
        mainService.updateClient(s,id);
        model.addAttribute("Clients", mainService.getClients());
        return "getClients";
    }

    @GetMapping("/stergeClient/{idClient}")
    public String stergeClient(@PathVariable int idClient, Model model) {
        mainService.stergeClient(idClient);
        model.addAttribute("Clients", mainService.getClients());
        return "getClients";
    }

//   Others

    @GetMapping("/main/getCategories")
    public String getCategories(Model model) {
        model.addAttribute("Categories", mainService.getCategories());
        return "getCategories";
    }

    @GetMapping("/main/getSubcategories")
    public String getSubcategories(Model model) {
        model.addAttribute("Subcategories", mainService.getSubcategories());
        return "getSubcategories";
    }

    @GetMapping("/main/getPromo")
    public String getPromo(Model model) {
        model.addAttribute("Promo", mainService.getPromo());
        return "getPromo";
    }

    @GetMapping("/main/getExtraCharge")
    public String getExtraCharge(Model model) {
        model.addAttribute("ExtraCharge", mainService.getExtraCharge());
        return "getExtraCharge";
    }

    @GetMapping("/main/getJobs")
    public String getJobs(Model model) {
        model.addAttribute("Jobs", mainService.getJobs());
        return "getJobs";
    }

    @GetMapping("/main/getAgeCat")
    public String getAgeCat(Model model) {
        model.addAttribute("AgeCat", mainService.getAgeCat());
        return "getAgeCat";
    }

    @GetMapping("/main/getPayMet")
    public String getPayMet(Model model) {
        model.addAttribute("PayMet", mainService.getPayMet());
        return "getPayMet";
    }

    @GetMapping("/main/getPayment")
    public String getPayment(Model model) {
        model.addAttribute("Payments", mainService.getPayment());
        return "getPayment";
    }

    //    Depozit

    @GetMapping("/main/getClientsDw")
    public String getClientsDw(Model model) {
        model.addAttribute("ClientsDw", mainService.getClientsDw());
        return "getClientsDw";
    }

    @GetMapping("/main/getPaymentsDw")
    public String getPaymentsDw(Model model) {
        model.addAttribute("PaymentsDw", mainService.getPaymentsDw());
        return "getPaymentsDw";
    }

    @GetMapping("/main/getPromoDw")
    public String getPromoDw(Model model) {
        model.addAttribute("PromoDw", mainService.getPromoDw());
        return "getPromoDw";
    }

    @GetMapping("/main/getSalServDw")
    public String getSalServDw(Model model) {
        model.addAttribute("SalServDw", mainService.getSalServDw());
        return "getSalServDw";
    }

    @GetMapping("/main/getServValueDw")
    public String getServValueDw(Model model) {
        model.addAttribute("ServValueDw", mainService.getServValueDw());
        return "getServValueDw";
    }

    @GetMapping("/main/getStaffDw")
    public String getStaffDw(Model model) {
        model.addAttribute("StaffDw", mainService.getStaffDw());
        return "getStaffDw";
    }

    @GetMapping("/main/getJobsDw")
    public String getJobsDw(Model model) {
        model.addAttribute("JobsDw", mainService.getJobsDw());
        return "getJobsDw";
    }

    @GetMapping("/main/getTimpDw")
    public String getTimpDw(Model model) {
        model.addAttribute("TimpDw", mainService.getTimpDw());
        return "getTimpDw";
    }

    @GetMapping("/templatePagina")
    public String getTemplate(Model model) {
//        model.addAttribute("TimpDw", mainService.getTimpDw());
        return "templatePagina";
    }
}
