package nika.goduadze.controller;

import nika.goduadze.dto.*;
import nika.goduadze.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/task-controller")
public class TaskController {
    @Autowired
    TaskService taskService;

    @PostMapping("get-tasks")
    public GetTasksOutput getTasks(@RequestBody GetTasksInput getTasksInput){
        return taskService.getAllTasks(getTasksInput);
    }

    @PostMapping("add-task")
    public AddTaskOutput addTask(@RequestBody AddTaskInput addTaskInput){
        return taskService.addTask(addTaskInput);
    }

    @PostMapping("delete-task")
    public DeleteTaskOutput deleteTask(@RequestBody DeleteTaskInput deleteTaskInput){
        return taskService.deleteTask(deleteTaskInput);
    }
}
