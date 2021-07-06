package com.vdab.services;

import com.vdab.domain.User;
import com.vdab.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> getUsers() {
        return userRepository.getUsers();
    }

    public void saveUser(User newUser) {
        userRepository.saveUser(newUser);
    }

    public User checkPassword(User user){
       return userRepository.checkPassword(user);
    }
}
