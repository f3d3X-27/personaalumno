package com.example.personaalumno.repositories;

import com.example.personaalumno.entities.Alumno;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends BaseRepository<Alumno, Long> {
}
