package com.example.springbootone.EmployeeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.function.Supplier;

import com.example.springbootone.Exception.ResourceNotFoundException;
import com.example.springbootone.dao.UserRepository;
import com.example.springbootone.entities.user;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    
	@Autowired
	private UserRepository userrepo;
	
	
	@GetMapping("/employees")
	public List<user> getAllEmployees(){
		return (List<user>) userrepo.findAll();
	}
	
	@PostMapping("/create")
	public user createEmployee(@Validated @RequestBody user employee) {	
		return userrepo.save(employee);
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<user> getEmployeebyid(@PathVariable Integer id) {
		user e = userrepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id :" +id));
		return ResponseEntity.ok(e);
	}
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<user> updateEmployee(@PathVariable Integer id,@RequestBody user employee) 
		
	{
      user e = userrepo.findById(id)
    		  .orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id :" +id));
	  e.setName(employee.getName());
	  e.setCity(employee.getCity());
	  e.setEmail(employee.getEmail());
	
	  user u =   userrepo.save(e);
	  return ResponseEntity.ok(u);
	
	}
	
	@DeleteMapping("/delemployees/{id}")
	public void  deleteEmployee(@PathVariable Integer id){
	      userrepo.deleteById(id);     
	}
	
	
	
	
	
}
