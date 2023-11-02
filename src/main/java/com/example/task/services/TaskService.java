package com.example.task.services;

import com.example.task.models.Task;
import com.example.task.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    /*
    public Optional<Task> getTask(Long taskId) {
        return taskRepository.findById(taskId);
    }
     */

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    public void deteleTask(Long taskId) {
        taskRepository.deleteById(taskId);
    }
}
