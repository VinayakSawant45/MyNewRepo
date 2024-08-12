package com.jsp.SpringBootCRUD.Controller;

import java.util.List;



import com.jsp.SpringBootCRUD.Dto.ResponseStructure;
import com.jsp.SpringBootCRUD.Dto.Student;
import com.jsp.SpringBootCRUD.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	// save student
	@PostMapping("/student")
	public ResponseStructure<Student> saveStudent(@RequestBody Student student){
		return studentService.saveStudent(student);
	}
	
	// get student by id
	@GetMapping("/student/{id}")
	public ResponseStructure<Student> getStudentById(@PathVariable int id){
		return studentService.getStudentById(id);
	}
	
	// get all students
	@GetMapping("/student")
	public ResponseStructure<List<Student>> getallStudent(){
		return studentService.getAllStudent();
	}
	
	// update student
	@PutMapping("/student/{id}")
	public ResponseStructure<Student> updateStudent(@RequestBody Student student, @PathVariable Integer id){
		return studentService.updateStudent(student, id);
	}
	
	// delete student
	@DeleteMapping("/student/{id}")
	public ResponseStructure<String> deleteStudent(@PathVariable int id){
		return studentService.deleteStudent(id);
	}
}