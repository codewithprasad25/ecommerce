package com.example.ProductListing.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/authentication")
public class AuthenticationController {

    @PostMapping("/signin")
    public ResponseEntity<String> authenticateUser() {
        return ResponseEntity.ok("Authentication is not required. Public API access granted.");
    }
}