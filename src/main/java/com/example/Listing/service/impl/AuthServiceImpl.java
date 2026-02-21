package com.example.ProductListing.service.impl;

import com.example.ProductListing.requestDto.LoginRequestDTO;
import com.example.ProductListing.responseDto.AuthResponseDTO;
import com.example.ProductListing.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;

    @Override
    public AuthResponseDTO login(LoginRequestDTO request) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUserName(),
                        request.getPassword()
                )
        );

        return AuthResponseDTO.builder()
                .accessToken("Basic authentication successful")
                .refreshToken(null)
                .tokenType("Basic")
                .userRole(authentication.getAuthorities().iterator().next().getAuthority())
                .build();
    }
}