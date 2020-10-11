package com.example.personaalumno.controllers;

import com.example.personaalumno.entities.Base;
import com.example.personaalumno.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class BaseControllerImpl<E extends Base, S extends BaseServiceImpl<E, Long>> implements BaseController<E, Long> {

    @Autowired
    protected S servicio;



    @GetMapping("")
    public ResponseEntity<?> getAll(){ // Nos va a brindar la respuesta en formato json para nuestra aplicacion web

        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll()); // si todo sale bien se van a encontrar la lista de personas actualizadas

        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde.\"}"); // En caso de que salga mal una respuesta en formato JSON

        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findById(id));

        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Id no encontrada.\"}"); // En caso de que salga mal una respuesta en formato JSON

        }
    }
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity){ // Para recibir una entidad debo declarar dentro del postBody
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.save(entity));

        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");

        }

    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody E entity){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entity));

        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");

        }

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(servicio.delete(id));

        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");

        }
    }
}
