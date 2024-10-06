package com.alumni.alumnusconnect_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED) // Inheritance strategy for User types
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false)
    private String password; // Store hashed password

    @Column(nullable = false, length = 20)
    private String role; // Role can be 'ALUMNI' or 'ADMIN'

    public boolean isValidEmail() {
        return email.contains("@"); // Simple email validation
    }
}
