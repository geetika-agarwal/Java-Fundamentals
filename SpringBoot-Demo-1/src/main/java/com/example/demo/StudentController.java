package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}

	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		return service.getStudentById(id);
	}

	@PostMapping("/students")
	public void createStudent(@RequestBody Student stu) {
		service.addStudent(stu);
	}

	@PutMapping("/student/{id}")
	public void updateStudent(@PathVariable("id") int id, @RequestBody Student s) {
		service.updateStudent(id, s);
	}

	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
	}
}
