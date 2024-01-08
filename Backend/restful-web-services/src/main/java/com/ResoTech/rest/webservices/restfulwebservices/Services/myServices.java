package com.ResoTech.rest.webservices.restfulwebservices.Services;

import com.ResoTech.rest.webservices.restfulwebservices.Entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface myServices {
    public List<Employee> getEmp();

    public Employee createEmp(Employee employee);

    public ResponseEntity<Employee> updateEmp(int id, com.ResoTech.rest.webservices.restfulwebservices.Entity.Employee empDetails);

    public ResponseEntity<HttpStatus> deleteEmp(int id);
}
