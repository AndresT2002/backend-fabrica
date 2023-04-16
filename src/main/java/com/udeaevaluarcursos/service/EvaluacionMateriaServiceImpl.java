package com.udeaevaluarcursos.service;

import com.udeaevaluarcursos.model.EvaluacionMateria;
import com.udeaevaluarcursos.repository.EvaluacionMateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EvaluacionMateriaServiceImpl implements EvaluacionMateriaService{

    @Autowired
    EvaluacionMateriaRepository evaluacionMateriaRepository;
    @Override
    public List<EvaluacionMateria> listEvaluacionesMaterias() {
        return null;
    }

    @Override
    public Optional<EvaluacionMateria> getEvaluacionMateriaById(int id) {
        return Optional.empty();
    }

    @Override
    public EvaluacionMateria createEvaluacionMateria(EvaluacionMateria evaluacionMateria) {
        return null;
    }

    @Override
    public EvaluacionMateria deleteEvaluacionMateria(int id) {
        return null;
    }
}
