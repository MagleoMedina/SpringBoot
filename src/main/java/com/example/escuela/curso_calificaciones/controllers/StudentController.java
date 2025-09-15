package com.example.escuela.curso_calificaciones.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.escuela.curso_calificaciones.models.Student;
import com.example.escuela.curso_calificaciones.services.StudentService;

@RestController
@RequestMapping("/students")
/**
 * 
 */
public class StudentController {

    @Autowired
    @Qualifier("studentList")
    private StudentService students; 
    

    @GetMapping
    public ResponseEntity<?> getAllStudents(){
        return  ResponseEntity.ok(students.getAllStudents());
    
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Integer id){
        return ResponseEntity.ok(students.getStudentById(id));
    }

    public URI funUri(String path, Student s){

        URI location = ServletUriComponentsBuilder.
            fromCurrentRequest().
            path(path).
            buildAndExpand(s.getId()).
            toUri();

        return location;
    }
    @PostMapping
    public ResponseEntity<?> postStudent(@RequestBody Student student){
        students.postStudent(student);

        URI location = funUri("/{id}", student);

        return ResponseEntity.created(location).build();
        
  

        //return ResponseEntity.status(HttpStatus.CREATED).body("YA lo creaste pa" + student);
    }

    @PutMapping
    public ResponseEntity <?> putStudent(@RequestBody Student student){
        
        return ResponseEntity.ok(students.putStudent(student));
        
    }

    @PatchMapping
    public ResponseEntity<?> patchNameStudent(@RequestBody Student student){
        
        return ResponseEntity.ok(students.patchStudent(student));

        //return ResponseEntity.status(HttpStatus.ACCEPTED).body("Todo bien " + student);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Integer id){
        students.deleteStudent(id);
        return ResponseEntity.noContent().build();
        /*
        for (Student student : students) {
            if (student.getId().equals(id)) {
                
                students.remove(student);
                
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Cliente eliminado satisfactoriamente " + id);
                
            }
        }
        //return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not foun pa " + id);
        return ResponseEntity.notFound().build();
        */
    }

}
