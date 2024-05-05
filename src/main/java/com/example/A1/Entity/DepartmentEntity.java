package com.example.A1.Entity;

import lombok.Getter;
import lombok.Setter;



import jakarta.persistence.*;



@Setter
@Getter
@Entity
@Table(name = "Department", schema = "AssignmentBackEnd")
public class DepartmentEntity {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dep_id")
    private int depId;
    @Basic@Column(name = "dep_name")
    private String depName;

}
