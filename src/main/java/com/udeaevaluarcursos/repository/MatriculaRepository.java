package com.udeaevaluarcursos.repository;

import com.udeaevaluarcursos.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula,Integer> {
}
