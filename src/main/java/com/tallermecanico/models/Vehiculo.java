package com.tallermecanico.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "vehiculos")
@ToString
@EqualsAndHashCode
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id_vehiculo")
    private Long id_vehiculo; // Identificador único del vehículo

    @Column(name = "modelo", length = 100, nullable = false)
    private String modelo; // Modelo del vehículo

    @Column(name = "marca", length = 100, nullable = false)
    private String marca; // Marca del vehículo

    @Column(name = "anio", nullable = false)
    private Long anio; // Año de fabricación del vehículo

    @Column(name = "numero_chasis", length = 50, nullable = true)
    private String numero_chasis; // Número de chasis del vehículo

    @Column(name = "numero_motor", length = 51, nullable = true)
    private String numero_motor; // Número de motor del vehículo

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private Cliente cliente; // Cliente al que pertenece el vehículo

}
