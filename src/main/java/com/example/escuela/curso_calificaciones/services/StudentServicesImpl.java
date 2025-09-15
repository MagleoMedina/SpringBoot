package com.example.escuela.curso_calificaciones.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.escuela.curso_calificaciones.models.Student;

@Service
public class StudentServicesImpl implements StudentService {

    List<Student> students = new ArrayList<>();

    public StudentServicesImpl(){
        
        students.add(new Student(1,22,"Carlos","elmascapo@gmail.com","Ing_Informatica"));
        students.add(new Student(2,23,"Ana","ana@gmail.com","Ing_Sistemas"));
        students.add(new Student(3,21,"Luis","luis@gmail.com","Ing_Mecatronica"));
    
    }

    @Override
    public List<Student> getAllStudents(){
        return students;
    }

    @Override
    public Student getStudentById(Integer s){
        for (Student student : students) {
            if (student.getId().equals(s)) {

                return student;
                
            }
            
        }
        return null;
        
    }   

    @Override
    public Student postStudent(Student s){
        students.add(s);
        System.out.println(s);
        return s;
    }

    @Override
    public Student putStudent(Student s){
        for (Student stu : students ) {
            if (stu.getId().equals(s.getId())) {
                stu.setName(s.getName());
                stu.setAge(s.getAge());
                stu.setEmail(s.getEmail());
                stu.setCourse(s.getCourse());
                return stu;
            }
            
        }
        return null;
    }

    @Override
    public Student patchStudent(Student s){
        for (Student student : students) {
            if (student.getId().equals(s.getId())) {
                student.setName(s.getName());
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteStudent (Integer i){
        for (Student student : students) {
            if (student.getId().equals(i)) {
                students.remove(student);
                
            }
            
        }
    }

    
}
