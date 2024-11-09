package com.upiiz.equipo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Entrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(50)")
    @NotBlank
    private String nombre;


    @NotBlank
    private String edad;

    @NotBlank
    private String nacionalidad;

    @JsonIgnoreProperties("entrenador")
    @OneToOne(mappedBy = "entrenador")
    private Equipo equipo;


}
