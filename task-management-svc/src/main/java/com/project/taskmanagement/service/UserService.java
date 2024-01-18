package com.project.taskmanagement.service;

import com.project.taskmanagement.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User createUser(User user);
}
