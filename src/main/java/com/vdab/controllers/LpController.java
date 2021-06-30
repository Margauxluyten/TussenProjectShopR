package com.vdab.controllers;

import com.vdab.domain.Game;
import com.vdab.domain.GameGenre;
import com.vdab.domain.Lp;
import com.vdab.domain.LpGenre;
import com.vdab.services.LpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LpController {

    @Autowired
    private LpService lpService;

    @GetMapping(value = "/lp")
    public String showLpPage(Model model){
        model.addAttribute("allLps",lpService.getLps());
        return "lps";
    }

    @GetMapping(value = "/addLp")
    public String showAddLpPage(Model model){
        model.addAttribute("newLp", new Lp());
        model.addAttribute("lpGenre", LpGenre.values());
        return "addlp";
    }
    @PostMapping(value = "saveLp")
    public String saveLp(@ModelAttribute Lp newLp){
        lpService.saveLp(newLp);
        return "redirect:/lp";
    }

    @GetMapping(value = "/editLp/{id}")
    public String showEditLpPage(@PathVariable("id")long id,Model model){
        model.addAttribute("editLp",lpService.findLpById(id));
        model.addAttribute("lpGenre", LpGenre.values());
        return "editlp";
    }

    @PostMapping(value = "/editedLp/{id}")
    public String editedLpPage(@ModelAttribute Lp lp){
        lpService.updateLp(lp);
        return "redirect:/lp";
    }

    @GetMapping(value = "/deleteLp/{id}")
    public String deleteLp(@PathVariable("id")long id){
        lpService.deleteLp(id);
        return "redirect:/lp";
    }
}
