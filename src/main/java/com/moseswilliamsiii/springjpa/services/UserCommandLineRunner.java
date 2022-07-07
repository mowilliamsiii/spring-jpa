package com.moseswilliamsiii.springjpa.services;

import com.moseswilliamsiii.springjpa.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class UserCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserCommandLineRunner.class);

    @Autowired
    private UserService userService;
    @Override
    public void run(String... args) throws Exception {
        User user  = new User("Mike", "Admin");
        long insert = userService.insert(user);
        log.info("New user is created: " + user);
    }
}
