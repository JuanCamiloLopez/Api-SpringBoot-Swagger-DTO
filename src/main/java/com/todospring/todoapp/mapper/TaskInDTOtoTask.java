package com.todospring.todoapp.mapper;

import com.todospring.todoapp.persistence.entity.Task;
import com.todospring.todoapp.persistence.entity.TaskStatus;
import com.todospring.todoapp.service.dto.TaskInDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskInDTOtoTask implements IMapper<TaskInDTO, Task> {

    @Override
    public Task map(TaskInDTO in) {
        Task task = new Task();
        task.setTitle(in.getTitle());
        task.setDescription(in.getDescription());
        task.setEta(in.getEta());
        task.setCreateDate(LocalDateTime.now());
        task.setTaskStatus(TaskStatus.ON_TIME);
        return task;
    }
}
