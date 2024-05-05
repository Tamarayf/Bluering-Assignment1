package com.example.A1.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "leave_type", schema = "AssignmentBackEnd", catalog = "")
public class LeaveTypeEntity {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_leave_type")
    private int idLeaveType;
    @Basic@Column(name = "name")
    private String name;

}
