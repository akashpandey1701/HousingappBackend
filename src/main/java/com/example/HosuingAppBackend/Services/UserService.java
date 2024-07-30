package com.example.HosuingAppBackend.Services;

import com.example.HosuingAppBackend.Models.User;
import com.example.HosuingAppBackend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> allEmployee()
    {
        return userRepository.findAll();
    }
}
