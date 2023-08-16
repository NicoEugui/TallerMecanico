package com.tallermecanico.repository;

import com.tallermecanico.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{

    public Empleado findByNombreUsuarioAndClave(String nombreUsuario, String clave);
}
