package com.example.A1.Service;

import com.example.A1.DTO.DepartmentDTO;
import com.example.A1.DTO.EmployeeDTO;
import com.example.A1.Entity.DepartmentEntity;
import com.example.A1.Entity.EmployeeEntity;

import java.util.List;
import java.util.Map;

public interface Service1 {

     DepartmentEntity DefineDepartment(DepartmentDTO departmentDTO);
     EmployeeEntity createEmployee(EmployeeDTO employeeDTO);
     void updateEmployee(Integer empId, Map<String, Object> entityDto);
     void updateDepartment(Integer depId, Map<String, Object> entityDto);
     Integer deleteEmployee(Integer empId);
     Integer deleteDepartment(Integer depId);
     EmployeeDTO getOneEmployee(Integer empId);
     List<EmployeeDTO> getEmployees();
     List<DepartmentDTO> getDepartments();
     DepartmentDTO getOneDepartment(Integer depId) ;
     List<EmployeeDTO> getEmployeesByDepartment(Integer departmentId);

}
