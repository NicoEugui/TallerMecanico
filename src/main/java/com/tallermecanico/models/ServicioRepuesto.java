package com.tallermecanico.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "servicio_repuesto")
@ToString
@EqualsAndHashCode
public class ServicioRepuesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id_servicio_repuesto")
    private Long id_servicio_repuesto;

    @ManyToOne
    @JoinColumn(name = "id_servicio", referencedColumnName = "id_servicio")
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "codigo_repuesto", referencedColumnName = "codigo_repuesto")
    private Repuesto repuesto;

    @Column(name = "cantidad_utilizada")
    private Long cantidad_utilizada;
}
