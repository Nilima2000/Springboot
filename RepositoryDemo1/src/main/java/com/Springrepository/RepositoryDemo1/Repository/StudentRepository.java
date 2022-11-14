package com.Springrepository.RepositoryDemo1.Repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.Springrepository.RepositoryDemo1.Entity.Student;

@Repository
public class StudentRepository implements DemoRepository<Student> {
	
	private Map<Long, Student> repository;
	public StudentRepository()
	{
		this.repository=new HashMap<>();
		
	}
	
	
	@Override
	public void save(Student student)
	{
		repository.put(student.getId(),student);
		}
	
	@Override
	public Student findStudentById(Long id)
	{
		return repository.get(id);
	}
}
