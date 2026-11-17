package com.klu.UnitTesting_Lab;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @GetMapping("/ms2/add")
    public String add(@RequestParam int a,
                      @RequestParam int b) {

        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8081/ms1/add?a="
                     + a + "&b=" + b;

        return restTemplate.getForObject(url, String.class);
    }
}