package com.project.taskmanagement.controller;

import com.project.taskmanagement.model.Task;
import com.project.taskmanagement.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/tasks")
    public String getAllTasks(Authentication authentication){
        return "Tasks list should be displayed here.";
//        List<Task> tasks = new ArrayList<Task>();
//        return tasks;
    }

    @PostMapping("/tasks/add-task")
    public Task saveTask(@RequestBody Task task){
        return taskService.createTask(task);
    }
}
