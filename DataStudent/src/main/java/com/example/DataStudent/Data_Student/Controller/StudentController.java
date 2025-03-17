package com.example.DataStudent.Data_Student.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.DataStudent.Data_Student.Entity.Student;
import com.example.DataStudent.Data_Student.Service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String showStudentList(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "index";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "add_student";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {
        studentService.addStudent(student);
        return "redirect:/students";
    }
}
