package com.bere.dev;

import com.bere.dev.model.User;
import com.bere.dev.service.UserService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        User user = User.builder()
                .name("Bere")
                .email("berenice.tlalolini@hotmail.com")
                .build();
        UserService userService = new UserService();
        userService.printUser(user);

    }
}