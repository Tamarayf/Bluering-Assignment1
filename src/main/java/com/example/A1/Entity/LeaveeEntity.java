package com.example.A1.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "Leavee", schema = "AssignmentBackEnd", catalog = "")
public class LeaveeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "leave_id")
    private int leaveId;
    @Basic@Column(name = "leave_type_id")
    private Integer leaveTypeId;
    @Basic@Column(name = "from_date")
    private Date fromDate;
    @Basic@Column(name = "to_date")
    private Date toDate;
    @Basic@Column(name = "number_of_days")
    private Integer numberOfDays;
    @Basic@Column(name = "note")
    private String note;
    @Basic@Column(name = "employee_id")
    private Integer employeeId;

}
