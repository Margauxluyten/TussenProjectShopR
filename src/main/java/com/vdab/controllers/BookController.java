package com.vdab.controllers;

import com.vdab.domain.*;
import com.vdab.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/book")
    public String showGamesPage(Model model) {
//        model.addAttribute("allBooks" , bookService.getBooks());
        model.addAttribute("allNonFictionBooks", bookService.getNonFictionBooks());
        model.addAttribute("allFictionBooks", bookService.getFictionBooks());
        return "books";
    }

    @GetMapping(value = "/addFictionBook")
    public String showAddFictionBookPage(Model model) {
        model.addAttribute("newFictionBook", new BookFiction());
        model.addAttribute("bookGenre", BookGenre.values());
        return "addfictionbook";
    }

    @PostMapping(value = "saveFictionBook")
    public String saveFictionBook(@ModelAttribute BookFiction newBookFiction) {
        bookService.saveFictionBook(newBookFiction);
        return "redirect:/book";
    }

    @GetMapping(value = "/addNonFictionBook")
    public String showAddNonFictionBookPage(Model model) {
        model.addAttribute("newNonFictionBook", new BookNonFiction());
        model.addAttribute("bookSubject", BookSubject.values());
        return "addnonfictionbook";
    }

    @PostMapping(value = "saveNonFictionBook")
    public String saveNonFictionBook(@ModelAttribute BookNonFiction newBookNonFiction) {
        bookService.saveNonFictionBook(newBookNonFiction);
        return "redirect:/book";
    }

    @GetMapping(value = "/editFictionBook/{id}")
    public String showEditFictionBookPage(@PathVariable("id") long id, Model model) {
        model.addAttribute("editFictionBook", bookService.findFictionBookById(id));
        model.addAttribute("bookGenre", BookGenre.values());
        return "editfictionbook";
    }

    @PostMapping(value = "/editedFictionBook/{id}")
    public String editedFictionBookPage(@ModelAttribute BookFiction bookFiction){
        bookService.updateFictionBook(bookFiction);
        return "redirect:/book";
    }

    @GetMapping(value = "/deleteFictionBook/{id}")
    public String deleteFictionBook(@PathVariable("id")long id){
        bookService.deleteFictionBook(id);
        return "redirect:/book";
    }

    @GetMapping(value = "/editNonFictionBook/{id}")
    public String showEditNonFictionBookPage(@PathVariable("id") long id, Model model) {
        model.addAttribute("editNonFictionBook", bookService.findNonFictionBookById(id));
        model.addAttribute("bookSubject", BookSubject.values());
        return "editnonfictionbook";
    }

    @PostMapping(value = "/editedNonFictionBook/{id}")
    public String editedNonFictionBookPage(@ModelAttribute BookNonFiction bookNonFiction){
        bookService.updateNonFictionBook(bookNonFiction);
        return "redirect:/book";
    }

    @GetMapping(value = "/deleteNonFictionBook/{id}")
    public String deleteNonFictionBook(@PathVariable("id")long id){
        bookService.deleteNonFictionBook(id);
        return "redirect:/book";
    }

}
