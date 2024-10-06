package com.alumni.alumnusconnect_backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "alumni")
public class Alumni extends Users {

    @Column(nullable = true, length = 4)
    private String graduationYear;

    @Column(nullable = true, length = 100)
    private String degree;

    @Column(nullable = true, length = 100)
    private String major;

    @Column(nullable = false)
    private LocalDateTime registeredAt = LocalDateTime.now();
}
