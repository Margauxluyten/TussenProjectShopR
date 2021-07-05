package com.vdab.controllers;

import com.vdab.domain.*;
import com.vdab.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ActionController {

    @Autowired
    private UserService userService;

    @Autowired
    private GameService gameService;

    @Autowired
    private LpService lpService;

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/")
    public String showHomePage(){
        return "index";
    }

    @GetMapping(value = "/login")
    public String showLogin(Model model){
        model.addAttribute("users", userService.getUsers());
        model.addAttribute("newUser", new User());
        return "login";
    }

    @PostMapping(value = "/checklogin")
    public String showLoginPage(@ModelAttribute User user, Model model){
        if(user.getId() == 1 ){
            model.addAttribute("allGames",gameService.getGames());
            model.addAttribute("allBooks",bookService.getBooks());
            model.addAttribute("allLps",lpService.getLps());
            model.addAttribute("user", user);
            return "articles";
        }else{
            model.addAttribute("allGames",gameService.getGames());
            model.addAttribute("allBooks",bookService.getBooks());
            model.addAttribute("allLps",lpService.getLps());
            model.addAttribute("user", user);
            return "articlesclient";
        }
    }

    @GetMapping(value = "/addCustomer")
    public String showAddUserPage(Model model){
        model.addAttribute("newUser", new User());
        return "addnewcustomer";
    }
    @PostMapping(value = "saveCustomer")
    public String saveUser(@ModelAttribute User newUser){
        userService.saveUser(newUser);
        return "redirect:/login";
    }

    @GetMapping(value = "/error")
    public String showErrorPage(){
        return "error";
    }
}
