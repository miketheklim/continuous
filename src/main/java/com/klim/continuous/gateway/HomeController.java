package com.klim.continuous.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "home";
    }


    @GetMapping("/home")
    public String homePage2() {
        return "home";
    }

}
