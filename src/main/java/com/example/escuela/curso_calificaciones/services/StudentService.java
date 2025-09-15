package com.example.escuela.curso_calificaciones.services;

import java.util.List;

import com.example.escuela.curso_calificaciones.models.Student;



public interface StudentService {

    public List<Student> getAllStudents();
    public Student getStudentById(Integer i);
    public Student postStudent(Student s);
    public Student putStudent(Student s);
    public Student patchStudent(Student s);
    public void deleteStudent(Integer i);


}
