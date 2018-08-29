package com.jinshiwu.petclinic.controller;

import com.jinshiwu.petclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by EL on 8/26/18.
 */
@Controller
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String getVets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
