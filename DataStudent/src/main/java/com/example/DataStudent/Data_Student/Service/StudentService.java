package com.example.DataStudent.Data_Student.Service;

import java.util.List;

import com.example.DataStudent.Data_Student.Entity.Student;

public interface StudentService {
    List<Student> getAllStudents();
    void addStudent(Student student);
}
