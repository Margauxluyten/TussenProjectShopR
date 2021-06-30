package com.vdab.controllers;

import com.vdab.domain.BookNonFiction;
import com.vdab.domain.BookSubject;
import com.vdab.domain.User;
import com.vdab.services.BookService;
import com.vdab.services.LoginService;
import com.vdab.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ActionController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String showHomePage(){
        return "index";
    }

    @GetMapping(value = "/login")
    public String showLogin(Model model){
        model.addAttribute("users", userService.getUsers());
        model.addAttribute("newUser", new User());
        return "index";
    }

    @PostMapping(value = "/login")
    public String showLoginPage(@ModelAttribute User user){
        if(user.getId() == 1 ){
            return "articles";
        }else{
            return "articlesclient";
        }
    }

}
