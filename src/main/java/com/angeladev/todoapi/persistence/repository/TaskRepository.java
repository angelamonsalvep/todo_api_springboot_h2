package com.angeladev.todoapi.persistence.repository;

import com.angeladev.todoapi.persistence.entity.Task;
import com.angeladev.todoapi.persistence.entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    public List<Task> findAllByTaskStatus (TaskStatus status);

}
