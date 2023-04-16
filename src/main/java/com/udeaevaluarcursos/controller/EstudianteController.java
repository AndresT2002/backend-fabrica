package com.udeaevaluarcursos.controller;

import com.udeaevaluarcursos.model.Estudiante;
import com.udeaevaluarcursos.service.EstudianteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/estudiante")
@CrossOrigin("*")
public class EstudianteController {

    @Autowired
    EstudianteServiceImpl estudianteServiceImpl;


    @PostMapping("/create-estudiante")
    public ResponseEntity<Estudiante> createEstudiante(@RequestBody Estudiante estudiante){

        Estudiante estudianteCreado=estudianteServiceImpl.createEstudiante(estudiante);

        if(estudianteCreado != null){
            return new ResponseEntity<>(estudianteCreado, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(estudianteCreado, HttpStatus.BAD_REQUEST);
        }
    }


}
