package com.example.personaalumno.services;

import com.example.personaalumno.entities.Localidad;
import com.example.personaalumno.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
