package com.example.demo.controller;

import com.example.demo.service.ExternalUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalUserController {

    private final ExternalUserService externalUserService;

    public ExternalUserController(ExternalUserService externalUserService) {
        this.externalUserService = externalUserService;
    }

    @GetMapping("/external/users")
    public String fetchExternalUsers() {
        return externalUserService.getExternalUsers();
    }
}

