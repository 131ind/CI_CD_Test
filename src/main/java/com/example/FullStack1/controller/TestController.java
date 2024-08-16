package com.example.FullStack1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tests")
public class TestController {

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
    public ResponseEntity<String> getTest(@PathVariable Long id) {
        return ResponseEntity.ok("Hello World: " + id);
    }
}
