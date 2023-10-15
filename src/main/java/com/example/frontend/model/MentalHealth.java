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
public class MentalHealth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String menatalName;
    private String place;

    @JsonIgnore
    @OneToMany(mappedBy = "mentalHealth")
    private List<HealthPolicy> healthPolicy;
}
