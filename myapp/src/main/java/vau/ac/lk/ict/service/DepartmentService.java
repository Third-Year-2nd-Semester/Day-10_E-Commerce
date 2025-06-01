package vau.ac.lk.ict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import vau.ac.lk.ict.model.Department;
import vau.ac.lk.ict.repo.DepartmentRepo;

@Service
public class DepartmentService {
    @Autowired
	private DepartmentRepo repo;
	
	public List<Department> getDepts(){
		return repo.findAll();
	}
	public Department getDept( int id) {
		if(repo.findById(id).isEmpty()) {
			throw new EntityNotFoundException("Department Not Found");
		}
		return repo.findById(id).get();
	}
	
	public String addDept(Department department) {
		if(repo.findById(department.getId()).isPresent()) {
			throw new DuplicateKeyException("The department id is already available");
		}
		repo.save(department);
		return "new department added";
	}
	
}