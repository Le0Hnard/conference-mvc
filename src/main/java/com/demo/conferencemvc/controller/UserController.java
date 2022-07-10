package com.demo.conferencemvc.controller;

import com.demo.conferencemvc.model.User;
import com.demo.conferencemvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser(
            @RequestParam(value = "firstname", defaultValue = "Snow") String firstname,
            @RequestParam(value = "lastname", defaultValue = "Ball") String lastname,
            @RequestParam(value = "age", defaultValue = "10") int age) {
        User user = new User();

        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user) {
        System.out.println("User firstname: " + user.getFirstname());
        userService.save(user);
        return user;
    }

}
