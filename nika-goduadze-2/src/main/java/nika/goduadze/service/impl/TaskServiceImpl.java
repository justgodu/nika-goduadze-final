package nika.goduadze.service.impl;

import nika.goduadze.dto.*;
import nika.goduadze.model.Task;
import nika.goduadze.repository.TaskRepository;
import nika.goduadze.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public GetTasksOutput getAllTasks(GetTasksInput getTasksInput) {

        List<TaskDTO> taskDTOList = new ArrayList<>();
        for (Task task : taskRepository.findAll()){
            TaskDTO taskDTO = new TaskDTO();
            taskDTO.setId(task.getId());
            taskDTO.setTitle(task.getTitle());
            taskDTO.setDescription(task.getDescription());
            taskDTO.setStartDate(task.getStartDate());
            taskDTO.setEndDate(task.getEndDate());
            taskDTOList.add(taskDTO);
        }


        GetTasksOutput getTasksOutput = new GetTasksOutput();
        getTasksOutput.setTasks(taskDTOList);
        return getTasksOutput;

    }

    @Override
    public AddTaskOutput addTask(AddTaskInput addTasksInput) {
        Task task = new Task();
        task.setTitle(addTasksInput.getTitle());
        task.setDescription(addTasksInput.getDescription());
        task.setStartDate(addTasksInput.getStartDate());
        task.setEndDate(addTasksInput.getEndDate());

        taskRepository.save(task);
        AddTaskOutput addTaskOutput = new AddTaskOutput();
        addTaskOutput.setMsg("Task added successfully");
        return addTaskOutput;
    }

    @Override
    public DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput) {

        Task task = taskRepository.getById(deleteTaskInput.getTaskId());
        taskRepository.delete(task);

        DeleteTaskOutput deleteTaskOutput = new DeleteTaskOutput();
        deleteTaskOutput.setMsg("Task deleted successfully");
        return deleteTaskOutput;
    }
}
