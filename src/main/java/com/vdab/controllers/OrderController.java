package com.vdab.controllers;

import com.vdab.domain.OrderArticle;
import com.vdab.services.BookService;
import com.vdab.services.GameService;
import com.vdab.services.LpService;
import com.vdab.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    @Autowired
    private LpService lpService;

    @Autowired
    private GameService gameService;

    @Autowired
    private BookService bookService;

    @Autowired
    private OrderService orderService;


    @GetMapping(value = "/buyArticle")
    public String showBoughtCartPage(){
        orderService.deleteQueryDb();
        return "buyarticle";
    }

    @GetMapping(value = "/placingorderLp/{id}")
    public String showOrderLpPage(@PathVariable("id")long id, Model model){
        model.addAttribute("lpChoice", lpService.findLpById(id));
//        model.addAttribute("orderedLp",new orderedLp());
//        model.addAttribute("gameChoice",gameService.findGameById(id));
////        model.addAttribute("orderedGame",new orderedGame());
//        model.addAttribute("nonFictionChoice",bookService.findNonFictionBookById(id));
////        model.addAttribute("orderedNonFictionBook",new orderedNonFictionBook());
//        model.addAttribute("fictionChoice", bookService.findFictionBookById(id));
////        model.addAttribute("orderedFictionBook",new orderedFictionBook());
        model.addAttribute("newOrderArticleLp",new OrderArticle());
        return "orderconfirmlp";
    }

    @PostMapping(value = "/orderingArticleLp/{id}")
    public String OrderingArticleLp(@ModelAttribute OrderArticle newBoughtArticle){
        orderService.buyArticle(newBoughtArticle);
        return "redirect:/shoppingCart";
    }
    @GetMapping(value = "/placingorderGame/{id}")
    public String showOrderGamePage(@PathVariable("id")long id, Model model){
        model.addAttribute("gameChoice",gameService.findGameById(id));
        model.addAttribute("newOrderArticleGame",new OrderArticle());
        return "orderconfirmgame";
    }
    @PostMapping(value = "/orderingArticleGame/{id}")
    public String OrderingArticleGame(@ModelAttribute OrderArticle newBoughtArticle){
        orderService.buyArticle(newBoughtArticle);
        return "redirect:/shoppingCart";
    }
    @GetMapping(value = "/placingorderBook/{id}")
    public String showOrderBookPage(@PathVariable("id")long id, Model model){
        model.addAttribute("bookChoice", bookService.findBooksById(id));
        model.addAttribute("newOrderArticleBook",new OrderArticle());
        return "orderconfirmbook";
    }
    @PostMapping(value = "/orderingArticleBook/{id}")
    public String OrderingArticleFiction(@ModelAttribute OrderArticle newBoughtArticle){
        orderService.buyArticle(newBoughtArticle);
        return "redirect:/shoppingCart";
    }
    @GetMapping(value = "/shoppingCart")
    public String showAllOrderPage(Model model){
        model.addAttribute("allOrderedArticles",orderService.getOrderedArticles());
        return "shoppingcart";
    }

    @GetMapping(value = "/editShoppingItem/{id}")
    public String editBuyShoppingItem(@PathVariable("id")long id, Model model){
        model.addAttribute("editItem",orderService.findOrderArticleById(id));
        return "editshoppingitem";
    }

    @PostMapping(value ="/editedShoppingItem/{id}")
    public String editedShoppingItem(@ModelAttribute OrderArticle orderArticle){
        orderService.updateShoppingItem(orderArticle);
        return "redirect:/shoppingCart";
    }

    @GetMapping(value = "/deleteItem/{id}")
    public String deleteItem(@PathVariable("id")long id){
        orderService.deleteItem(id);
        return "redirect:/shoppingCart";
    }

}
