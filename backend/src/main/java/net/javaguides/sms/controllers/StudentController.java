package net.javaguides.sms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.sms.entities.Student;
import net.javaguides.sms.services.StudentService;
import net.javaguides.sms.services.imp.StudentServiceImp;

@Controller
@RequestMapping(path = "/student")
public class StudentController {

	//Programação orientada a interface
	@Autowired //também é possivel criar um construtor desse atributo, evitando o uso do autowired
	private StudentService studentService;
	
	@GetMapping
	public String listStudents (Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return ResponseEntity.ok(result);
	}
	
	
}
