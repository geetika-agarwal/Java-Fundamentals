package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private List<Student> studentList = new ArrayList<Student>(
			Arrays.asList(new Student(1, "Geetika", 22), new Student(2, "John", 24), new Student(3, "King", 20)));

	public List<Student> getAllStudents() {
		return studentList;
	}

	public Student getStudentById(int id) {
		return studentList.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
	}

	public void addStudent(Student s) {
		studentList.add(s);
	}

	public void deleteStudent(int id) {
		studentList.removeIf(student -> (student.getId() == id));
	}

	public void updateStudent(int id, Student s) {
		Student stu;
		studentList.forEach(student -> {
			if (student.getId() == id)
				studentList.set(studentList.indexOf(student), s);
		});
	}
}
