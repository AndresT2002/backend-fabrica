package com.udeaevaluarcursos.service;
import com.udeaevaluarcursos.model.Profesor;
import java.util.List;
import java.util.Optional;

public interface ProfesorService {
    public List<Profesor> listProfesors();
    public Optional<Profesor> getProfesorById(int id);
    public Profesor createProfesor(Profesor profesor);
    public Profesor deleteProfesor(Profesor profesor);
}
