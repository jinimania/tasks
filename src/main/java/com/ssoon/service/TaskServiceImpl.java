package com.ssoon.service;

import com.ssoon.domain.Task;
import com.ssoon.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

  private TaskRepository taskRepository;

  public TaskServiceImpl(final TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

  @Override
  public Iterable<Task> list() {
    return this.taskRepository.findAll();
  }

  @Override
  public Task save(final Task task) {
    return this.taskRepository.save(task );
  }
}
