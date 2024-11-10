package com.example.controller;

import com.example.exception.InvalidCredentials;
import com.example.exception.UnauthorizedUser;
import com.example.repository.Authorities;
import com.example.service.AuthorizationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorizationController {
    AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user,
                                            @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }


}
