package com.example.task.data;

import com.example.task.models.Task;
import com.example.task.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class TaskData implements CommandLineRunner {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskData(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Task task1 = new Task();
        task1.setTitle("Tache n°1");
        task1.setDescription("Une description de la tâche 1 !");
        task1.setCompleted(false);
        taskRepository.save(task1);

        Task task2 = new Task();
        task2.setTitle("Tache n°2");
        task2.setDescription("Une description de la tâche 2 !");
        task2.setCompleted(true);
        taskRepository.save(task2);
    }
}
