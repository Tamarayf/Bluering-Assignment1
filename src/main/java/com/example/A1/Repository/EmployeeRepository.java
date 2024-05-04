package com.example.A1.Repository;


import com.example.A1.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer> {


}

