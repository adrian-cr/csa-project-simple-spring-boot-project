package com.cognizant.SimpleBootProject.repositories;

import com.cognizant.SimpleBootProject.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
