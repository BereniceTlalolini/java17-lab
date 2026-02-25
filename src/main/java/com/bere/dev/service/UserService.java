package com.bere.dev.service;

import com.bere.dev.model.User;

public class UserService {
    public void printUser (User user){
        System.out.println("User: " + user.getName() + "-" + user.getEmail());
    }
}
