package com.example.DataStudent.Data_Student.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.DataStudent.Data_Student.Entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
    private final Map<Integer, Student> studentMap = new HashMap<>();

    public StudentServiceImpl() {

        studentMap.put(1, new Student(1, "Raul Asencio", 22, "Male", "asencio@raul.com", "Madrid", "2002-08-11"));
        studentMap.put(2, new Student(2, "Fede Valverde", 24, "Male", "falconfede@capitano.com", "Montilivo", "2007-09-21"));
        studentMap.put(3, new Student(3, "Arda Gular", 19, "Male", "arda@gular.com", "Turkey", "2008-09-14"));

    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentMap.values());
    }

    @Override
    public void addStudent(Student student) {
        studentMap.put(student.getId(), student);
    }
}