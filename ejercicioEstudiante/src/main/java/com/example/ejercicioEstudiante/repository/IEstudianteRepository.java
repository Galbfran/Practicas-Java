package com.example.ejercicioEstudiante.repository;

import com.example.ejercicioEstudiante.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteRepository extends JpaRepository<Estudiante , Long> {
}
