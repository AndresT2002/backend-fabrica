package com.udeaevaluarcursos.service;

import com.udeaevaluarcursos.model.Materia;
import com.udeaevaluarcursos.repository.EvaluacionProfesorRepository;
import com.udeaevaluarcursos.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaServiceImpl implements MateriaService{

    @Autowired
    MateriaRepository materiaRepository;


    @Override
    public List<Materia> listMaterias() {
        return null;
    }

    @Override
    public Optional<Materia> getMateriaById(int id) {
        return Optional.empty();
    }

    @Override
    public Materia createMateria(Materia materia) {
        return null;
    }

    @Override
    public Materia deleteMateria(int id) {
        return null;
    }

    @Override
    public Materia updateMateria(Materia materia) {
        return null;
    }
}
