package com.ResoTech.rest.webservices.restfulwebservices.Controller;
import com.ResoTech.rest.webservices.restfulwebservices.Services.myServices;
import com.ResoTech.rest.webservices.restfulwebservices.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/employees")
public class MyController {
    @Autowired
    private myServices myServices;

    @GetMapping()
    public List<Employee> getEmp() {
        return this.myServices.getEmp();
    }
    @PostMapping
    public Employee createEmp(@RequestBody Employee employee){
        return this.myServices.createEmp(employee);
    }
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmp(@PathVariable int id, @RequestBody Employee empDetails){
        return this.myServices.updateEmp(id,empDetails);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmp(@PathVariable int id){
        return this.myServices.deleteEmp(id);
    }
}
