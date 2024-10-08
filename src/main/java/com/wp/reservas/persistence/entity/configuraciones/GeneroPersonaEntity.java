package com.wp.reservas.persistence.entity.configuraciones;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "generos_personas")
@Getter
@Setter
public class GeneroPersonaEntity {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "descripcion")
    private String descripcion;

}
