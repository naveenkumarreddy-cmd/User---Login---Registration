package com.nkr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nkr.entity.UserLogin;
import com.nkr.repository.LoginRepository;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    // ✅ REGISTRATION LOGIC (INSERT)
    public String register(UserLogin user) {

        // check if email already exists
        UserLogin existing = loginRepository.findByEmail(user.getEmail());

        if (existing != null) {
            return "EMAIL_ALREADY_EXISTS";
        }

        // save new user
        loginRepository.save(user);
        return "REGISTER_SUCCESS";
    }

    // ✅ LOGIN LOGIC (VALIDATION)
    public String login(String email, String password) {

        UserLogin user =
                loginRepository.findByEmailAndPassword(email, password);

        return (user != null) ? "LOGIN_SUCCESS" : "INVALID_CREDENTIALS";
    }
}
