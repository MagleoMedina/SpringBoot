package com.example.escuela.curso_calificaciones.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    private Integer id, stock;
    private String name;
    private Double price;
    

}
