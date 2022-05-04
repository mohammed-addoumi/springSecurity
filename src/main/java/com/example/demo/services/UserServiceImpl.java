package com.example.demo.services;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAllUsers() {
        return List.of(new User(1l,"simo",28),
                       new User(2l,"test",28));
    }
}
