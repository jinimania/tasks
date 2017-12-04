package com.ssoon.controller;

import com.ssoon.domain.Task;
import com.ssoon.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/tasks")
public class TaskController {

  private TaskService taskService;

  public TaskController(final TaskService taskService) {
    this.taskService = taskService;
  }

  @GetMapping(value = {"", "/"})
  public Iterable<Task> list() {
    return this.taskService.list();
  }

  @PostMapping(value = "/save")
  public Task saveTask(@RequestBody Task task) {
    return this.taskService.save(task);
  }
}
