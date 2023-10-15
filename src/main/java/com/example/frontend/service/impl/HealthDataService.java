package com.example.frontend.service.impl;

import com.example.frontend.model.HealthData;
import com.example.frontend.repository.HealthDataRepository;
import com.example.frontend.service.IHealthDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HealthDataService implements IHealthDataService {
    private final HealthDataRepository healthDataRepository;
    @Override
    public void create(HealthData healthData) {
        healthDataRepository.save(healthData);
    }

    @Override
    public void delete(Long id) {
        healthDataRepository.deleteById(id);
    }

    @Override
    public HealthData getHealthData(Long id) {
        return healthDataRepository.findById(id).get();
    }
}
