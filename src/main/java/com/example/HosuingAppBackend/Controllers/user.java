package com.example.HosuingAppBackend.Controllers;

import com.example.HosuingAppBackend.Models.User;
import com.example.HosuingAppBackend.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class user {

    @Autowired
    private UserService userService;

    @GetMapping
   private List<User> getallUsers() {
    return userService.allEmployee();
    }


}
