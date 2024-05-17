package ee.ivkhk.jwtsecurity.controller;

import ee.ivkhk.jwtsecurity.entity.Student;
import ee.ivkhk.jwtsecurity.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "students")
    public List<Student> list(){
        return studentService.list();
    }


}
