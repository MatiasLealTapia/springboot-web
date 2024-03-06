package com.matias.udemy.curso.webapp.springbootweb.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("name", "Matias");
        model.addAttribute("lastname", "Leal");
        return "details";
    }

    @GetMapping("/detailsMap")
    public String detailsMap(Map<String, Object> model) {
        model.put("title", "Hola mundo Spring Boot");
        model.put("name", "Matias");
        model.put("lastname", "Leal");
        return "detailsMap";
    }
}
