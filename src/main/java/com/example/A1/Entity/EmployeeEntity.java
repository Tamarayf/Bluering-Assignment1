package com.example.A1.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "new_employee", schema = "AssignmentBackEnd", catalog = "")
public class EmployeeEntity {
    @Id@Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    @Basic@Column(name = "emp_name")
    private String empName;
    @Basic@Column(name = "emp_email")
    private String empEmail;
    @Basic@Column(name = "emp_address")
    private String empAddress;
    @Basic@Column(name = "dep_id")
    private Integer departmentId;
    @Transient
    private String departmentName;



}
