package com.example.AuthorizationService.controller;

import com.example.AuthorizationService.exception.InvalidCredentials;
import com.example.AuthorizationService.exception.UnauthorizedUser;
import com.example.AuthorizationService.repository.Authorities;
import com.example.AuthorizationService.service.AuthorizationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorizationController {
    AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> handleInvalidCredentials(InvalidCredentials ex) {
        System.out.println("Exception: " + ex.getMessage());
        return new ResponseEntity<>("Exception: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> handleUnauthorizedUser (UnauthorizedUser ex) {
        System.out.println("Exception: " + ex.getMessage());
        return new ResponseEntity<>("Exception: " + ex.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
