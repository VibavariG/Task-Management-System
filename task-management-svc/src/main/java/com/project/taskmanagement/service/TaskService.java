package com.project.taskmanagement.service;

import com.project.taskmanagement.model.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {

    public Task createTask(Task task);
}
