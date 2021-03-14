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
        mainService.updateStaff(s,id);
        model.addAttribute("staffMembers", mainService.getStaff());
        return "getStaff";
    }

    @GetMapping("/stergeAngajat/{idStaff}")
    public String stergeAngajat(@PathVariable int idStaff, Model model) {
        mainService.stergeAngajat(idStaff);
        model.addAttribute("staffMembers", mainService.getStaff());
        return "getStaff";
    }


}
