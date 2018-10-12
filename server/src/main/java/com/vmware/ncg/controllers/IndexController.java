package com.vmware.ncg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}