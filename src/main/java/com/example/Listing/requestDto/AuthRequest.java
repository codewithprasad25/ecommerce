package com.example.ProductListing.requestDto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginRequestDTO {

    @NotBlank(message = "Username must not be empty")
    private String userName;

    @NotBlank(message = "Password must not be empty")
    private String password;
}