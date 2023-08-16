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

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    private Persona persona;

    @Getter
    @Setter
    @Column(name = "cargo", nullable = false)
    private String cargo;

    @Getter
    @Setter
    @Column(name = "nombre_usuario", length = 50, nullable = false)
    private String nombreUsuario;

    @Getter
    @Setter
    @Column(name = "clave", nullable = false)
    private String clave;

    public Empleado(Long id_empleado, Persona persona, String cargo, String nombreUsuario, String clave) {
        this.id_empleado = id_empleado;
        this.persona = persona;
        this.cargo = cargo;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    public Empleado() {
    }
}
