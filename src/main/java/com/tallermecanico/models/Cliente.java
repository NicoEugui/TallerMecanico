package com.tallermecanico.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "clientes")
@ToString
@EqualsAndHashCode
public class Cliente {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id_cliente;

    @ManyToOne
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    private Persona persona;
}
