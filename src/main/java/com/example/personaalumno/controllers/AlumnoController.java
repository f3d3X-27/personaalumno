package com.example.personaalumno.controllers;


import com.example.personaalumno.entities.Alumno;
import com.example.personaalumno.services.AlumnoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping(path = "api/v1/usuarios")
public class AlumnoController extends BaseControllerImpl<Alumno, AlumnoServiceImpl>{

}