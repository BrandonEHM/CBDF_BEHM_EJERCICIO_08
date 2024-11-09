package com.upiiz.equipo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "equipo_competencia")
public class EquipoCompetencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**/
    @JsonIgnoreProperties("equipoCompetencias")
    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;
    /**/
    @JsonIgnoreProperties("equipoCompetencias")
    @ManyToOne
    @JoinColumn(name = "competencia_id")
    private Competencia competencia;
}
