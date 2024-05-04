package com.example.A1.DTO;


import lombok.Data;

@Data
public class EmployeeDTO {
    private Integer empId;
    private String empName;
    private String empEmail;
    private String empAddress;
    private Integer departmentId;
    private String departmentName;
}
