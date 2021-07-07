package nika.goduadze.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TaskDTO {

    Long Id;
    String title;
    String description;
    Date startDate;
    Date endDate;
}
