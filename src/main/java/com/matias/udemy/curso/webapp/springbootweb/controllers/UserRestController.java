package com.matias.udemy.curso.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> details() {
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo Spring Boot");
        body.put("name", "Matias");
        body.put("lastname", "Leal");
        return body;
    }

    @RequestMapping(path = "/detailsMapping", method = RequestMethod.GET)
    public Map<String, Object> detailsMapping() {
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo Spring Boot");
        body.put("name", "Matias");
        body.put("lastname", "Leal");
        return body;
    }
}
