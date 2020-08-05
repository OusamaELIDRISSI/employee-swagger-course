package com.globomantics.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleService {

    @GetMapping("/schedule")
    public String getSchedule() {

        return "Your schedule is M-F 9-5";
    }
}
