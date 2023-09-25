package com.example.UMSWithValidation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserManagement {
    @Id
    private Integer userId;
    private String userName;
    private String userDOB;
    private String phoneNumber;
    private String userEmail;
    private LocalDateTime dateTime;
}
