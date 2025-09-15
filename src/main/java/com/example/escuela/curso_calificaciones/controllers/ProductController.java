package com.example.escuela.curso_calificaciones.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.escuela.curso_calificaciones.services.ProductService;


@RestController
@RequestMapping("/products")

public class ProductController {

    @Autowired
    private ProductService productsServices;

    @GetMapping
    public ResponseEntity<?> getAllProducts(){

        return ResponseEntity.ok(productsServices.getAllProducts());
        //return ResponseEntity.status(HttpStatusCode.valueOf(200)).
        //body(" Los productos son " + productsServices.getAllProducts());
    }

}
