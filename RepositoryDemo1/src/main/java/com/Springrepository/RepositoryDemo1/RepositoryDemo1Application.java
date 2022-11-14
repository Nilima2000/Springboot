package com.Springrepository.RepositoryDemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Springrepository.RepositoryDemo1.Entity.Student;
import com.Springrepository.RepositoryDemo1.Repository.StudentRepository;

@SpringBootApplication
public class RepositoryDemo1Application {

	public static void main(String[] args) {
		//SpringApplication.run(RepositoryDemo1Application.class, args);
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(); 
	        context.scan("com.Springrepository.RepositoryDemo1"); 
	        context.refresh(); 
	  
	        StudentRepository repository = context.getBean(StudentRepository.class); 
	  
	        // testing the store method 
	        repository.save(new Student(1L, "Nilima", 23)); 
	        repository.save(new Student(2L, "Saba", 22)); 
	  
	        // testing the retrieve method 
	        Student student = repository.findStudentById(1L); 
	        System.out.println(student); 
	  
	        // close the spring context 
	        context.close(); 
	}

}
