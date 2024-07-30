package com.example.HosuingAppBackend.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
public class HealtthCheckController {

    @GetMapping
    public String healthCheck()
    {
        return "Ok";
    }
}
