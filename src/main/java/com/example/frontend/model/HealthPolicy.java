package com.example.frontend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class HealthPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    private MentalHealth mentalHealth;

    @JsonIgnore
    @OneToMany(mappedBy = "healthPolicy")
    private List<HealthData> healthData;
}
