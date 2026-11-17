package com.klu.UnitTesting_Lab;

import org.springframework.web.bind.annotation.*;

@RestController
public class AdditionController {

    @GetMapping("/ms1/add")
    public String add(@RequestParam int a,
                      @RequestParam int b) {

        int sum = a + b;

        return "ms1.1 addition " + sum;
    }
}