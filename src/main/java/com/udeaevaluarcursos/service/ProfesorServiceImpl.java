package com.udeaevaluarcursos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udeaevaluarcursos.model.Profesor;
import com.udeaevaluarcursos.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService {
    @Autowired
    ProfesorRepository profesorRepository;

    @Override
    public List<Profesor> listProfesors() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listProfesors'");
    }

    @Override
    public Profesor getProfesorById(int cedula) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProfesorById'");
    }

    @Override
    public Profesor createProfesor(Profesor profesor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createProfesor'");
    }

    @Override
    public Profesor deleteProfesor(int cedula) {
        return null;
    }

    @Override
    public Profesor updateProfesor(Profesor profesor) {
        return null;
    }

}
