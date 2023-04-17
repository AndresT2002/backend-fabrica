package com.udeaevaluarcursos.service;
import com.udeaevaluarcursos.model.Profesor;
import java.util.List;

public interface ProfesorService {
    public List<Profesor> listProfesors();

    public Profesor getProfesorByCedula(int cedula);
    public Profesor createProfesor(Profesor profesor);

    public Profesor deleteProfesor(int cedula);

    public Profesor updateProfesor(Profesor profesor);
}
