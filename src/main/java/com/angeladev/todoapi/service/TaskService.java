package com.angeladev.todoapi.service;

import com.angeladev.todoapi.mapper.TaskInDTOToTask;
import com.angeladev.todoapi.persistence.entity.Task;
import com.angeladev.todoapi.persistence.repository.TaskRepository;
import com.angeladev.todoapi.service.dto.TaskInDTO;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository repository;
    private final TaskInDTOToTask mapper;

    public TaskService(TaskRepository repository, TaskInDTOToTask mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Task createTask(TaskInDTO taskInDTO){
        Task task = mapper.map(taskInDTO);
        return this.repository.save(task);
    }
}
