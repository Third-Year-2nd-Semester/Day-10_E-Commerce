package vau.ac.lk.ict.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vau.ac.lk.ict.model.Department;
import vau.ac.lk.ict.service.DepartmentService;
@RestController
@RequestMapping("/dept")
public class DepartmentController {
	@Autowired
	public DepartmentService service;
	
	@GetMapping
	public ResponseEntity<List<Department>>getDepts(){
		return new ResponseEntity<List<Department>>
		(service.getDepts(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Department> getDept(@PathVariable("id") int id) {
		return new ResponseEntity<Department>(service.getDept(id),HttpStatus.OK);
	}

    @PostMapping
    public ResponseEntity<String> addDept(@RequestBody Department department){
        return new ResponseEntity<String>(service.addDept(department),HttpStatus.OK);
    }


}
