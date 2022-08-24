package com.employee.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	#Commit added
	@Autowired
    private EmployeeService service;


     @GetMapping("/employees")
     public List<Employee> getAllEmployee(){
         return service.getAllEmployee();
     }

     @PostMapping(value="/addemployee")
     public void addEmployee(@RequestBody Employee addEmployee){
         service.addEmployee(addEmployee);
     }

     @PutMapping(value="/updateEmployee/{id}")
     public void updateEmployee(@PathVariable int id, @RequestBody Employee updateEmployee){

        service.updateEmployee(id,updateEmployee);
     }

     @DeleteMapping(value="/delete/{id}")
     public void deleteEmployee(@PathVariable int id){
         service.deleteEmployee(id);
     }

}
