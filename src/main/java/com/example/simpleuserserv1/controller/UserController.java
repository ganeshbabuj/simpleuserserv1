package com.example.simpleuserserv1.controller;

import com.example.simpleuserserv1.resource.User;
import com.example.simpleuserserv1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/account")
public class UserController {

    // dependency
    private UserService userService;

    // Constructor Injection (vs Setter Injection)
    //@Inject //(Not mandatory)
    //@Autowired //(Not mandatory)
    public UserController(UserService userService) {
        this.userService = userService;
    }

}


