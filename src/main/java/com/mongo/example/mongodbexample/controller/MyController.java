package com.mongo.example.mongodbexample.controller;

import com.mongo.example.mongodbexample.models.Student;
import com.mongo.example.mongodbexample.rep.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    @GetMapping("/Hello-World")
    public String HelloWorld()
    {
        return "Hello-World";
    }

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/addStudent")
    public String saveBook(@RequestBody Student student) {
        studentRepository.save(student);
        return "Added student with id : " + student.getId();
    }

    @GetMapping("/findAllStudents")
    public List<Student> getBooks() {
        return studentRepository.findAll();
    }

    @GetMapping("/findAllStudents/{id}")
    public Optional<Student> getBook(@PathVariable int id) {
        return studentRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        studentRepository.deleteById(id);
        return "student deleted with id : " + id;
    }

}
