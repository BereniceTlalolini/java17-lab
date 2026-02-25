package com.bere.dev;

import com.bere.dev.model.User;
import com.bere.dev.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BereApplication {

    public static void main(String[] args){
        SpringApplication.run(BereApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService){
        return args -> {

            User user = User.builder()
                    .name("Bere")
                    .email("berenice.tlalolini@hotmail.com")
                    .build();

            userService.printUser(user);
        };
    }
}