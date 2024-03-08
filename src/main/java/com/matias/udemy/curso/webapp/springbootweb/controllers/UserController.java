package com.matias.udemy.curso.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.matias.udemy.curso.webapp.springbootweb.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Matías", "Leal");
        user.setEmail("abc@djks.cl");
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {

        // model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {
        return Arrays.asList(
                new User("Pepa", "Gonzalez"),
                new User("Lalo", "Perez", "lalo@correo.cl"),
                new User("Juanita", "Roe", "juaana@correo.com"),
                new User("Andres", "Doe"));
    }

    @GetMapping("/detailsMap")
    public String detailsMap(Map<String, Object> model) {
        model.put("title", "Hola mundo Spring Boot");
        model.put("name", "Matias");
        model.put("lastname", "Leal");
        return "detailsMap";
    }
}
