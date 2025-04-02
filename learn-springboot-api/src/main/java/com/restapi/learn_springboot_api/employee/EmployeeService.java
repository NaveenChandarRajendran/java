package com.restapi.learn_springboot_api.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }
	
	public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
	
	 public Employee updateEmployee(Long id, Employee employeeDetails) {
	        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
	        if (optionalEmployee.isPresent()) {
	            Employee employee = optionalEmployee.get();
	            employee.setName(employeeDetails.getName());
	            employee.setEmail(employeeDetails.getEmail());
	            employee.setDepartment(employeeDetails.getDepartment());
	            return employeeRepository.save(employee);
	        } else {
	            return null;
	        }
	 }
	 
	 public void deleteEmployee(Long id) {
	        employeeRepository.deleteById(id);
	 }
}
