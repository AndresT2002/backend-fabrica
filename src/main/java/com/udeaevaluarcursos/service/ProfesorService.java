package com.udeaevaluarcursos.service;
import com.udeaevaluarcursos.model.Profesor;
import java.util.List;
import java.util.Optional;

public interface ProfesorService {
    public List<Profesor> listProfesors();
    public Profesor getProfesorById(int cedula );
    public Profesor createProfesor(Profesor profesor);
    public Profesor deleteProfesor(int cedula);

    public Profesor updateProfesor(Profesor profesor);
}
