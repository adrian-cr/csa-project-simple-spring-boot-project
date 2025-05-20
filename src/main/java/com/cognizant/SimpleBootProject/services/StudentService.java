package com.cognizant.SimpleBootProject.services;

import com.cognizant.SimpleBootProject.models.Student;
import com.cognizant.SimpleBootProject.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRep;

    public List<Student> getAllStudents() {
        return studentRep.findAll();
    }

    public Student getStudentById(Integer id) {
        return studentRep.findById(id).get();
    }

    public Student addStudent(Student student) {
        return studentRep.save(student);
    }

    public void updateStudent(Integer id, String name, String email, Integer age) {
        if (studentRep.existsById(id)) {
            Student student = studentRep.findById(id).get();
            if (name != null) student.setName(name);
            if (email != null) student.setEmail(email);
            if (age != null) student.setAge(age);
        }
    }

    public void deleteStudent(Integer id) {
        studentRep.deleteById(id);
    }
}