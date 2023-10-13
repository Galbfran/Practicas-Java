package com.example.ejercicioEstudiante.repository;

import com.example.ejercicioEstudiante.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITemaRepository extends JpaRepository <Tema, Long> {
}
