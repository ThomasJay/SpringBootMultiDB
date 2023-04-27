package com.thomasjayconsulting.multidb.service;

import com.thomasjayconsulting.multidb.dto.NewUserRequest;
import com.thomasjayconsulting.multidb.model.User;
import com.thomasjayconsulting.multidb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void insert(NewUserRequest newUser) {

        User user = new User();

        user.setEmailAddress(newUser.getEmailAddress());
        user.setFirstName(newUser.getFirstName());
        user.setLastName(newUser.getLastName());

        userRepository.save(user);

    }
}
