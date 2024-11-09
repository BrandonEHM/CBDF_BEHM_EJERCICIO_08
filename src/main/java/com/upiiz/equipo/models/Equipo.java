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
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "VARCHAR(50)")
    @NotBlank
    private String nombre;

/**/
@JsonIgnoreProperties("equipos")
    @ManyToOne
    @JoinColumn(name = "liga_id")
    private Liga liga;


    @JsonIgnoreProperties("equipo")
    @OneToOne
    @JoinColumn(name = "entrenador_id")
    private Entrenador entrenador;
/**/
@JsonIgnoreProperties("equipo")
    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<Jugador> jugadores;

    @JsonIgnoreProperties("equipo")
    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<EquipoCompetencia> equipoCompetencias;


}
