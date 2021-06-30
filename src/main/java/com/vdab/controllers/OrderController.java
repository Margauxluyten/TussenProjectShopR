package com.vdab.controllers;

import com.vdab.services.BookService;
import com.vdab.services.GameService;
import com.vdab.services.LpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class OrderController {

    @Autowired
    private LpService lpService;

    @Autowired
    private GameService gameService;

    @Autowired
    private BookService bookService;


    @GetMapping(value = "/shoppingcart")
    public String showShoppingCartPage(){
        return "shoppingcart";
    }

}
