package com.udeaevaluarcursos.service;

import com.udeaevaluarcursos.model.EvaluacionMateria;
import com.udeaevaluarcursos.model.EvaluacionProfesor;

import java.util.List;
import java.util.Optional;

public interface EvaluacionProfesorService {


    public List<EvaluacionProfesor> listEvaluacionesProfesores();
    public EvaluacionProfesor getEvaluacionProfesorById(int id);

    public EvaluacionProfesor createEvaluacionProfesor(EvaluacionProfesor evaluacionProfesor);
    public EvaluacionProfesor deleteEvaluacionProfesor(int id);




}
