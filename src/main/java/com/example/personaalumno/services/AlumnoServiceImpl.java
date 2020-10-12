package com.example.personaalumno.services;

import com.example.personaalumno.entities.Alumno;
import com.example.personaalumno.repositories.AlumnoRepository;
import com.example.personaalumno.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl extends BaseServiceImpl<Alumno, Long> implements AlumnoService{

    @Autowired
    private AlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(BaseRepository<Alumno, Long> baseRepository){
        super(baseRepository);
    }
}
