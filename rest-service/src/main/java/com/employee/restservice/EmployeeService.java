package com.employee.restservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
    public EmployeeRepo repo;

    public List<Employee> getAllEmployee() {

        List<Employee> employeeList=new ArrayList<>();
        repo.findAll().forEach(employeeList::add);
    
        return employeeList;
    }

    public void addEmployee(Employee addEmployee) {
        repo.save(addEmployee);
    }

    public void updateEmployee(int id, Employee updateEmployee) {
        repo.save(updateEmployee);
    }

    public void deleteEmployee(int id) {
        repo.deleteById(id);
    }

}
