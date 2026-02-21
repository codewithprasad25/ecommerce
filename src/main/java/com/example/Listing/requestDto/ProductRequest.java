package com.example.ProductListing.requestDto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductRequestDTO {

    @NotBlank(message = "Product name must not be empty")
    private String name;

    @NotBlank(message = "CreatedBy must not be empty")
    private String createdByUser;
}