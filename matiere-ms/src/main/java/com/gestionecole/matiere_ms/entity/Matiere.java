package com.gestionecole.matiere_ms.entity;

import jakarta.persistence.*;

import lombok.Getter;

import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name="matiere")
@Setter
@Getter
public class Matiere implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "matiere_id")
    private long employeeId;

    @Column(name = "name")
    private String name;

}
