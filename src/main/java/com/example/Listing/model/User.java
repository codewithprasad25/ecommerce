package com.example.ProductListing.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "app_users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApplicationUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "user_name", unique = true, nullable = false, length = 100)
    @NotBlank(message = "Username cannot be empty")
    private String userName;

    @Column(name = "user_password", nullable = false, length = 255)
    @NotBlank(message = "Password cannot be empty")
    private String userPassword;

    @Column(name = "user_role", nullable = false, length = 50)
    private String userRole;  // e.g. ROLE_USER / ROLE_ADMIN
}