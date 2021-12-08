package com.quiz.quizbe.controller;

import com.quiz.quizbe.exception.ResourceNotFoundException;
import com.quiz.quizbe.model.User;
import com.quiz.quizbe.repository.UserRepository;
import com.quiz.quizbe.security.CurrentUser;
import com.quiz.quizbe.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

//    @GetMapping("/user/me")
//    @PreAuthorize("hasRole('USER')")
//    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
//        return userRepository.findById(userPrincipal.getId())
//                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
//    }

    @GetMapping("/user/listuser")
    @PreAuthorize("hasRole('ADMIN')")
    public List<User> getListUser() {
        return userRepository.findAll();
    }
}