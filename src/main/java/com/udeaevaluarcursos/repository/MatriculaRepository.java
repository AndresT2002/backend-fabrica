package com.udeaevaluarcursos.repository;

import com.udeaevaluarcursos.model.Estudiante;
import com.udeaevaluarcursos.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula,Integer> {


    Optional<Matricula> findByidEstudiante(Estudiante idEstudiante);
}
