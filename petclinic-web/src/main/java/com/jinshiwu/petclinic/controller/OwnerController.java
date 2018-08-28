package com.jinshiwu.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by EL on 8/26/18.
 */
@Controller
@RequestMapping({"/owners"})
public class OwnerController {
    @RequestMapping({"/", "/index", "/index.html",
            "/index.htm"})
    public String getOwners(){
        return "owners/index";
    }
}
