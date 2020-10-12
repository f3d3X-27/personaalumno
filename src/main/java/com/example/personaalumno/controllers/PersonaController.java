package com.example.personaalumno.controllers;

import com.example.personaalumno.entities.Persona;
import com.example.personaalumno.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")  //Brinda el acceso  o no desde distintos origines  o clientes
@RequestMapping(path = "api/v1/personas") // a traves de esta uri podemos acceder a los metodos de persona //
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {



      /*@GetMapping("/search")
      public ResponseEntity<?> search (@RequestParam String filtro){
          try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
          }catch (Exception e){
             return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \""+e.getMessage()+"\"}"));
          }
      }*/

}
