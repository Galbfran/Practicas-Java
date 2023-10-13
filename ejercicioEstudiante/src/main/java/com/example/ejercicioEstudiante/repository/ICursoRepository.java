package com.example.ejercicioEstudiante.repository;

import com.example.ejercicioEstudiante.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepository extends JpaRepository<Curso, Long> {
}
