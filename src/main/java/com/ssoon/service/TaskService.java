package com.ssoon.service;

import com.ssoon.domain.Task;

public interface TaskService {

  Iterable<Task> list();

  Task save(final Task task);
}
