package com.ResoTech.rest.webservices.restfulwebservices.Repository;

import com.ResoTech.rest.webservices.restfulwebservices.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Employee,Integer> {

}
