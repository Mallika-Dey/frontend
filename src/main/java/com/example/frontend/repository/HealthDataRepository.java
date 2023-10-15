package com.example.frontend.repository;

import com.example.frontend.model.HealthData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthDataRepository extends JpaRepository<HealthData, Long> {
}
