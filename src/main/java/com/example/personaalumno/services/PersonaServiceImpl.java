package com.example.personaalumno.services;

import com.example.personaalumno.entities.Persona;
import com.example.personaalumno.repositories.BaseRepository;
import com.example.personaalumno.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona,Long> baseRepository){
        super(baseRepository);
    }


}
