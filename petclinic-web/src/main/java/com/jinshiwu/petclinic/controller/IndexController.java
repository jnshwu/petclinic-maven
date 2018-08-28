package com.jinshiwu.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by EL on 8/26/18.
 */
@Controller
public class IndexController {

    @RequestMapping({"/", "index", "index.html"})
    public String index() {
        return "index";
    }
}
