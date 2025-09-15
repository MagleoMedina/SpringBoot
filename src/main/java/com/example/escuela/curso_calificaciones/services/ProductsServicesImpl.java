package com.example.escuela.curso_calificaciones.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.escuela.curso_calificaciones.models.Product;

@Service
public class ProductsServicesImpl implements ProductService {

    List<Product> products = new ArrayList<>();

    public ProductsServicesImpl(){
        products.add(new Product(1,35,"Laptop",78.6));
        products.add(new Product(2,20,"Mouse",5.6));
        products.add(new Product(3,15,"Teclado",10.0));
        products.add(new Product(4,50,"Monitor",150.0));
    }

    @Override
    public List<Product> getAllProducts(){
        return products;
    }
}
