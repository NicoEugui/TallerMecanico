package com.tallermecanico.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "personas")
@ToString
@EqualsAndHashCode
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id_persona")
    private Long id_persona;

    @Getter
    @Setter
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Getter
    @Setter
    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Getter
    @Setter
    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Getter
    @Setter
    @Column(name = "telefono", nullable = false)
    private String telefono;

    @Getter
    @Setter
    @Column(name = "email", nullable = false)
    private String email;


}
