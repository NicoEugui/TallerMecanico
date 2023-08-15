package com.tallermecanico.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "empleados")
@ToString
@EqualsAndHashCode
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id_empleado")
    private Long id_empleado;

    @ManyToOne
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    private Persona persona;

    @Column(name = "cargo", nullable = false)
    private String cargo;

    @ManyToOne
    @JoinColumn(name = "id_servicio", referencedColumnName = "id_servicio")
    private Servicio servicio;

    @Column(name = "nombre_usuario", length = 50, nullable = false)
    private String nombre_usuario;

    @Column(name = "clave", nullable = false)
    private String clave;


}
