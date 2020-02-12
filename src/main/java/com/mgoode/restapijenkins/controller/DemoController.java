package com.mgoode.restapijenkins.controller;

import com.mgoode.restapijenkins.service.Calculator;
import com.mgoode.restapijenkins.service.ICalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    Calculator calculator;

    @GetMapping("/")
    public String home() {
        return "This is home for the Jenkins test   " + calculator.add(10, 30);
    }

}
