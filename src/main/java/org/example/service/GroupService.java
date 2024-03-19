package org.example.service;

import org.example.entity.Student;
import org.example.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }


    public String addStudent(Student student) {
        if(!student.getName().isBlank() && student.getName().length() >2){
            repository.save(student);
        }
        return "ADDED";
    }
    public List<Student> getAllStudent(){
        return repository.findAll();
    }


}
