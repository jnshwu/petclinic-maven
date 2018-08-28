package com.jinshiwu.petclinic.controller;

import com.jinshiwu.petclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by EL on 8/26/18.
 */
@Controller
@RequestMapping({"/owners"})
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @RequestMapping({"/", "/index", "/index.html",
            "/index.htm"})
    public String getOwners(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
