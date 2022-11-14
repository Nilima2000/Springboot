package com.Springrepository.RepositoryDemo1.Repository;

public interface DemoRepository<T> {
	
	public void save(T t);
	public T findStudentById(Long id);

}
