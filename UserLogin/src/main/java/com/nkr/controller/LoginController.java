package com.nkr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nkr.entity.UserLogin;
import com.nkr.service.LoginService;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private LoginService loginService;

    // 🔐 LOGIN
    @PostMapping("/login")
    public String login(@RequestBody UserLogin user) {
        return loginService.login(
                user.getEmail(),
                user.getPassword()
        );
    }

    // 📝 REGISTER
    @PostMapping("/register")
    public String register(@RequestBody UserLogin user) {
        return loginService.register(user);
    }
}
