package com.udeaevaluarcursos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udeaevaluarcursos.model.Matricula;
import com.udeaevaluarcursos.repository.MatriculaRepository;

@Service
public class MatriculaServiceImpl implements MatriculaService  {
    @Autowired
    MatriculaRepository matriculaRepository;

    @Override
    public List<Matricula> listMatriculas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listMatriculas'");
    }

    @Override
    public Optional<Matricula> getMatriculaById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMatriculaById'");
    }

    @Override
    public Matricula createMatricula(Matricula matricula) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createMatricula'");
    }

    @Override
    public Matricula deleteMatricula(Matricula matricula) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteMatricula'");
    }
}
