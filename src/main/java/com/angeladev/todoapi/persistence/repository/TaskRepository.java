package com.angeladev.todoapi.persistence.repository;

import com.angeladev.todoapi.persistence.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
