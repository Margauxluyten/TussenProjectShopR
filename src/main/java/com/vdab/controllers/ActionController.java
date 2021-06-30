package com.vdab.controllers;

import com.vdab.domain.BookNonFiction;
import com.vdab.domain.BookSubject;
import com.vdab.domain.User;
import com.vdab.services.BookService;
import com.vdab.services.LoginService;
import com.vdab.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ActionController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String showHomePage() {
        return "index";
    }

//    @RequestMapping(value = "/Login", method = {RequestMethod.GET, RequestMethod.POST})
//    public String showLoginPage(@ModelAttribute User user, Model model) {
//        if (user.getId() == 1) {
//            model.addAttribute("user", userService.getUsers());
//            model.addAttribute("user", user);
//            return "articles";
//        } else {
//            model.addAttribute("user", userService.getUsers());
//            model.addAttribute("user", user);
//            return "articlesclient";
//        }
//    }
}



//    @PostMapping(value = "/login")
//    public String showLoginPage(@ModelAttribute User user){
//        if(user.getId() == 1 ){
//            return "articles";
//        }else{
//            return "articlesclient";
//        }
//    }


