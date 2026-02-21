package com.example.ProductListing.responseDto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthResponseDTO {

    private String accessToken;
    private String refreshToken;
    private String tokenType;
    private String userRole;
}