package com.udeaevaluarcursos.repository;

import com.udeaevaluarcursos.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends JpaRepository<Materia,Integer> {
}
