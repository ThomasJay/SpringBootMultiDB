package com.thomasjayconsulting.multidb.controller;

import com.thomasjayconsulting.multidb.dto.NewUserRequest;
import com.thomasjayconsulting.multidb.service.AnalyticsService;
import com.thomasjayconsulting.multidb.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class UserRestController {

    @Autowired
    UserService userService;

    @Autowired
    AnalyticsService analyticsService;


    @GetMapping("/users/{userId}")
    public String getUser(@PathVariable(name="userId") String userId) {
        log.info("getUser userId: " + userId);
        // Update count of user access
        analyticsService.addUserAccess(userId);
        return "";
    }

    @PostMapping("/users")
    public String createUser(@RequestBody NewUserRequest newUser) {

        log.info("createUser newUser: " + newUser);

        // insert user into db
        userService.insert(newUser);

        return "Done";
    }
}
