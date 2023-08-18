package com.tallermecanico.repository;

import com.tallermecanico.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpleadoRepository extends JpaRepository<Empleado,Long> {
    Optional<Empleado> findByUsername(String username);

    Empleado findByUsernameAndPassword(String username, String password);
}
