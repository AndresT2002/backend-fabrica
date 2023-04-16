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
       List<Profesor> profesors = profesorRepository.findAll();
       return profesors;
    }

    @Override
    public Profesor getProfesorByCedula(int cedula) {
        Optional<Profesor> profesor = profesorRepository.findByCedula(cedula);
        if(!profesor.isPresent()){
            return null;
        }
        return profesor.get();
    }

    @Override
    public Profesor createProfesor(Profesor profesor) throws Exception {
        Optional<Profesor> tempProfesor = profesorRepository.findByCedula(profesor.getCedula());
        if(tempProfesor.isPresent()){
            throw new Exception("A profesor already exists with that cedula");
        }
        return profesorRepository.save(profesor);
    }

    @Override
    public Profesor deleteProfesor(int cedula) {
        Optional<Profesor> profesor = profesorRepository.deleteByCedula(cedula);
        if(!profesor.isPresent()){
            return null;
        }
        return profesor.get();
    }

    @Override
    public Profesor updateProfesor(Profesor profesor) {
        Profesor newProfesor = profesorRepository.save(profesor);
        return newProfesor;
    }

}
