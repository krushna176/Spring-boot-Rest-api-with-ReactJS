package com.ResoTech.rest.webservices.restfulwebservices.Services;

import com.ResoTech.rest.webservices.restfulwebservices.Entity.Employee;
import com.ResoTech.rest.webservices.restfulwebservices.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesImpl implements myServices {
    @Autowired
    private Repository repository;
    @Override
    public List<Employee> getEmp() {
        return repository.findAll();
    }

    @Override
    public Employee createEmp(Employee employee) {

        return repository.save(employee);
    }

    @Override
    public ResponseEntity<Employee> updateEmp(int id, Employee empDetails) {
        Optional<Employee> emp;
        try {
            emp = repository.findById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Employee emp1=emp.get();
        emp1.setEmpFirstName(empDetails.getEmpFirstName());
        emp1.setEmpLastName(empDetails.getEmpLastName());
        emp1.setEmpEmail(empDetails.getEmpEmail());
        repository.save(emp1);
        return ResponseEntity.ok(emp1);
    }

    @Override
    public ResponseEntity<HttpStatus> deleteEmp(int id) {
        try {
            repository.findById(id).get();
            repository.deleteById(id);

        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
