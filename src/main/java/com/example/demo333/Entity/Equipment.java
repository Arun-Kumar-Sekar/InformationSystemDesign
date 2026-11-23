package com.example.demo333.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "equipment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipment;

    private String libelle;

    @ManyToMany(mappedBy = "requirements", fetch = FetchType.LAZY)
    private Set<Vehicle> vehicles = new HashSet<>();

}
