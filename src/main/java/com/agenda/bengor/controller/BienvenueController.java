package com.agenda.bengor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bienvenue")
public class BienvenueController {

    @RequestMapping(method = RequestMethod.GET)
    public String afficherBienvenue(final ModelMap pModel) {

        pModel.addAttribute("personne", "Bengor");
        return "bienvenue";
    }
}