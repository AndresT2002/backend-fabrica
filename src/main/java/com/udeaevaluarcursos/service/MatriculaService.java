package com.udeaevaluarcursos.service;
import com.udeaevaluarcursos.model.Matricula;
import java.util.List;
import java.util.Optional;

public interface MatriculaService {
    
    public List<Matricula> listMatriculas();
    public Optional<Matricula> getMatriculaById(int id);
    public Matricula createMatricula(Matricula matricula);
    public Matricula deleteMatricula(Matricula matricula);
}
