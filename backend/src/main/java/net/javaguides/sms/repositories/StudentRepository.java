package net.javaguides.sms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	
}
