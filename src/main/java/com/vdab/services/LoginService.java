package com.vdab.services;

import com.vdab.repositories.LoginRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Getter
    private static boolean loggingIn;

    public boolean loginPage(String userName, String password) {
        loggingIn = userName.equals(password);
        return loggingIn;
    }
}
