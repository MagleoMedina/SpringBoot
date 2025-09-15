package com.example.escuela.curso_calificaciones.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Student {

    private Integer id, age;
    private String name, email, course;
    


}
