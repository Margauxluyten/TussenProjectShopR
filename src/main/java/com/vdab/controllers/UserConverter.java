package com.vdab.controllers;

import com.vdab.services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

//@Component
//public class UserConverter implements Formatter<User> {
//
//    @Autowired
//    private UserService userService;

//    @Override
//    public User parse(String s, Locale locale) throws ParseException {
//        return userService.getUsers();
//    }
//
//    @Override
//    public String print(User user, Locale locale) {
//        return (user != null ? String.valueOf(user.getId()) : "");
//    }
//}
