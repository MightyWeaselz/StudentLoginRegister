package com.consti.security.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/v1/student-control")
public class AdminController {
    private final StudentService studentService;

    @Autowired
    public AdminController(StudentService studentService){
        this.studentService = studentService;
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        studentService.deleteStudent(studentId);
    }

    @GetMapping
    public ResponseEntity<String> String(){
        return ResponseEntity.ok("Hello Admin");
    }
}