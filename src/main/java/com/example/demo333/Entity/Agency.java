package com.example.demo333.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "agency")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgency;

    private String nom;

    private String ville;

    private String address;

    private String telephone;

    @OneToMany(mappedBy = "agency", fetch = FetchType.LAZY)
    private List<Vehicle> vehicles = new ArrayList<>();

    @OneToMany(mappedBy = "agency", fetch = FetchType.LAZY)
    private List<Employe> employs = new ArrayList<>();
}
