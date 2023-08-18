package com.tallermecanico.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "servicio_repuesto")
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ServicioRepuesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id_servicio_repuesto")
    private Long id_servicio_repuesto;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "id_servicio", referencedColumnName = "id_servicio")
    private Servicio servicio;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "codigo_repuesto", referencedColumnName = "codigo_repuesto")
    private Repuesto repuesto;

    @Getter
    @Setter
    @Column(name = "cantidad_utilizada")
    private Long cantidad_utilizada;
}
