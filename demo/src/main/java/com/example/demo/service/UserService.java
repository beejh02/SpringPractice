package com.example.demo.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User registerUser(String username, String password) {
        if(userRepository.findByUsername(username).isPresent()) throw new RuntimeException("이미 존재하는 사용자입니다.");

        String encodedPassword = passwordEncoder.encode(password);
        User user = User.builder()
            .username(username)
            .password(encodedPassword)
            .build();
        return userRepository.save(user);
    }

}
