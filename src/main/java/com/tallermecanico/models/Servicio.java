package com.tallermecanico.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "servicios")
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id_servicio")
    private Long id_servicio;

    @Getter
    @Setter
    @Column(name = "descripcion", length = 1000, nullable = false)
    private String descripcion;

    @Getter
    @Setter
    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Getter
    @Setter
    @Column(name = "costo", nullable = false)
    private Long costo;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "id_vehiculo", referencedColumnName = "id_vehiculo")
    private Vehiculo vehiculo;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado")
    private Empleado empleado;
}
