package net.javaguides.sms;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entities.Student;
import net.javaguides.sms.repositories.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		//Student student1 = new Student("Pedro", "Lima", "pedro@gmail.com");
		//Student student2 = new Student("Paulo", "Roberto", "paulo@gmail.com");
		//Student student3 = new Student("Vanessa", "Oliveira", "vanesa@gmail.com");
		
		//studentRepository.saveAll(Arrays.asList(student1, student2, student3));
		
		
	}

}
