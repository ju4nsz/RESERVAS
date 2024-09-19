package com.wp.reservas.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @Column(name = "contrasenia")
    private String contrasenia;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "nombre1")
    private String nombre1;

    @Column(name = "nombre2")
    private String nombre2;

    @Column(name = "apellido1")
    private String apellido1;

    @Column(name = "apellido2")
    private String apellido2;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "id_genero")
    private Integer idGenero;

    @Column(name = "id_rol")
    private Integer idRol;
}
