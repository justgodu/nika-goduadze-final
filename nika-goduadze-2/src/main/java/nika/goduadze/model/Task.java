package nika.goduadze.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Date startDate;
    @Column(nullable = false)
    private Date endDate;
}
