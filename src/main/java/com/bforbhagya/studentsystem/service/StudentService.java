package com.bforbhagya.studentsystem.service;

import com.bforbhagya.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();

}
