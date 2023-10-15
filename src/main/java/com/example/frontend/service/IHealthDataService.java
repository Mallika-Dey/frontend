package com.example.frontend.service;

import com.example.frontend.model.HealthData;

public interface IHealthDataService {
    public void create(HealthData healthData);
    public void delete(Long id);
    public HealthData getHealthData(Long id);
}
