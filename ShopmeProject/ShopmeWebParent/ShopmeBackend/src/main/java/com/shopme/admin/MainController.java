package com.shopme.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    /**
     * Return the logical view name which is the homepage of the
     * backend application - Admin Control Panel
     */
    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }
}
