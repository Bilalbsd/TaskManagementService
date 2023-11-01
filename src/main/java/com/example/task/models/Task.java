package com.example.task.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

@Entity
public class Task {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String description;
    private boolean isCompleted;

    public Task() {}

    public Task(String title, String description, boolean isCompleted) {
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
