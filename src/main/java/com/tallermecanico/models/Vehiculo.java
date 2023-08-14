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
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id_persona")
    private Long id_persona;

    @Column(name = "modelo", length = 100, nullable = false)
    private String modelo;

    @Column(name = "marca", length = 100, nullable = false)
    private String marca;

    @Column(name = "anio", nullable = false)
    private Long anio;

    @Column(name = "numero_chasis", length = 50, nullable = true)
    private String numero_chasis;

    @Column(name = "numero_motor", length = 50, nullable = true)
    private String numero_motor;

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private Cliente cliente;

}
