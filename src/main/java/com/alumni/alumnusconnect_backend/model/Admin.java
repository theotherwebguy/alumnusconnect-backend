package com.alumni.alumnusconnect_backend.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Admin extends Users {
    // Admin can have specific fields or permissions if needed
}
