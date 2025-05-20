package com.cognizant.SimpleBootProject.controllers;

import com.cognizant.SimpleBootProject.models.Student;
import com.cognizant.SimpleBootProject.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/students/")
public class StudentController {
    private final StudentService ss;

    @Autowired
    public StudentController(StudentService ss) {
        super();
        this.ss = ss;
    }

    @GetMapping
    public List<Student> getStudents(){
        return ss.getAllStudents();
    }

    @GetMapping(path="{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer id) {
        return ss.getStudentById(id);
    }

    @PostMapping
    public void addStudent(@RequestBody Student student) {
        ss.addStudent(student);
    }

    @PutMapping(path="{studentId}")
    public void updateStudent(
        @PathVariable("studentId") Integer id,
        @RequestParam(name="name", required=false) String name,
        @RequestParam(name="email", required=false) String email,
        @RequestParam(name="age", required=false) Integer age
    ) {
        ss.updateStudent(id, name, email, age);
    }

    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer id) {
        ss.deleteStudent(id);
    }

}
