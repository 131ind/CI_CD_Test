package com.example.FullStack1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
@RequestMapping("/api/tests")
public class TestController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getTest(@PathVariable Long id) {
        return ResponseEntity.ok("Hello World: " + id);
    }
}
