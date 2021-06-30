package com.vdab.controllers;

import com.vdab.services.ArticleService;
import com.vdab.services.BookService;
import com.vdab.services.GameService;
import com.vdab.services.LpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

    @Autowired
    private GameService gameService;

    @Autowired
    private LpService lpService;

    @Autowired
    private BookService bookService;


    @GetMapping(value = "/articles")
    public String showArticlesPage(Model model){
       model.addAttribute("allGames",gameService.getGames());
       model.addAttribute("allBooks",bookService.getBooks());
       model.addAttribute("allLps",lpService.getLps());
        return "articles";
    }

    @GetMapping(value = "/articlesclient")
    public String showArticlesClientPage(Model model){
        model.addAttribute("allGames",gameService.getGames());
        model.addAttribute("allBooks",bookService.getBooks());
        model.addAttribute("allLps",lpService.getLps());
        return "articlesclient";
    }
}
