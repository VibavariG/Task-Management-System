package com.project.taskmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private String author;
    private LocalDate dueDate;
    private String status = "Pending";
    private LocalDateTime updatedOn = LocalDateTime.now();
}
