package com.parkjh.covid19project.controller;

import com.parkjh.covid19project.dto.HomeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @RestController
@RequiredArgsConstructor
@Controller
public class HomeController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HomeDto homeDto(@RequestParam("name") String prName, @RequestParam("amount") int prAmount) {
        return new HomeDto(prName, prAmount);
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/main")
    public String main() {
        return "index";
    }
}
