package com.bforbhagya.studentsystem.repository;

import com.bforbhagya.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
