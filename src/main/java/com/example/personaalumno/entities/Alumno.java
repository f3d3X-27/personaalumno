package com.example.personaalumno.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited


public class Alumno extends Base{
    private String nombre;
    private String apellido;
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name ="create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;


    public void prePersist(){
        this.createAt=new Date();
    }







}
