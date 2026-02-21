package com.example.ProductListing.service;

import com.example.ProductListing.requestDto.LoginRequestDTO;
import com.example.ProductListing.responseDto.AuthResponseDTO;

public interface AuthService {
    AuthResponseDTO login(LoginRequestDTO request);
}