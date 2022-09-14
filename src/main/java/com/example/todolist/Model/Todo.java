package com.example.todolist.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {
    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false)
    private Long id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String todoStatus ;

    @CreationTimestamp
    @Column(updatable = false)
    Timestamp cateCreated;
    @UpdateTimestamp
    Timestamp lastModified;
}
