package com.matias.udemy.curso.webapp.springbootweb.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.matias.udemy.curso.webapp.springbootweb.models.User;
import com.matias.udemy.curso.webapp.springbootweb.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {
        User user = new User("Matías", "Leal");

        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Matías", "Leal");
        User user2 = new User("Andres", "Pizarro");
        User user3 = new User("Diego", "Zapata");

        List<User> users = Arrays.asList(user, user2, user3);
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        return users;
    }

    @GetMapping("/details-v1")
    public Map<String, Object> detailsV1() {
        User user = new User("Matías", "Leal");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo Spring Boot");
        body.put("user", user);
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
