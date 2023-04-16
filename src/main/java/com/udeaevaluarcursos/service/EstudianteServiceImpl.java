package com.udeaevaluarcursos.service;

import com.udeaevaluarcursos.model.Estudiante;
import com.udeaevaluarcursos.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> listEstudiantes() {
        return null;
    }

    @Override
    public Optional<Estudiante> getEstudianteById(int id) {
        return Optional.empty();
    }

    @Override
    public Estudiante createEstudiante(Estudiante evaluacionMateria) {
        return null;
    }

    @Override
    public Estudiante deleteEstudiante(int cedula) {
        return null;
    }

    @Override
    public Estudiante updateEstudiante(Estudiante estudiante) {
        return null;
    }
}
