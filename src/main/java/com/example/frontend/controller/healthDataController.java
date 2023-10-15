package com.example.frontend.controller;

import com.example.frontend.model.HealthData;
import com.example.frontend.response.ResponseHandler;
import com.example.frontend.service.IHealthDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequiredArgsConstructor
@RequestMapping("/healthdata")
public class healthDataController {
    private final IHealthDataService healthDataService;

    @PostMapping("/add")
    public ResponseEntity<?> create(@RequestBody HealthData healthData) {
        healthDataService.create(healthData);
        return ResponseEntity.ok("created");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        healthDataService.delete(id);
        return ResponseEntity.ok("deleted");
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> get(@PathVariable Long id) {
        return ResponseHandler.generateResponse(new Date(), "health data",
                HttpStatus.OK, healthDataService.getHealthData(id));
    }
}
