package nika.goduadze.service;

import nika.goduadze.dto.*;

public interface TaskService {
    GetTasksOutput getAllTasks(GetTasksInput getTasksInput);
    AddTaskOutput addTask(AddTaskInput addTasksInput);
    DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput);
}
