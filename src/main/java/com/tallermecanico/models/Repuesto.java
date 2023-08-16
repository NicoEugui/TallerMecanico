package com.tallermecanico.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "repuestos")
@ToString
@EqualsAndHashCode
public class Repuesto {

    @Id
    @Getter
    @Setter
    @Column(name = "codigo_repuesto", length = 50, nullable = false)
    private String codigo_repuesto;

    @Getter
    @Setter
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Getter
    @Setter
    @Column(name = "descripcion", length = 1000, nullable = false)
    private String descripcion;

    @Getter
    @Setter
    @Column(name = "fabricante", nullable = false)
    private String fabricante;

    @Getter
    @Setter
    @Column(name = "precio", nullable = false)
    private Long precio;
}
