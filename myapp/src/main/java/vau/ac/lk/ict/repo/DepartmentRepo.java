package vau.ac.lk.ict.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import vau.ac.lk.ict.model.Department;

public interface DepartmentRepo extends JpaRepository<Department,Integer > {

}
