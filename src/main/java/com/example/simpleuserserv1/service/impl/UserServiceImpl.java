package com.example.simpleuserserv1.service.impl;

import com.example.simpleuserserv1.resource.User;
import com.example.simpleuserserv1.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(long id) {
        return new User(id, "user_" + id, new Random().nextInt(90));
    }

}
