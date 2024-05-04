package com.example.A1.Repository;

import com.example.A1.Entity.LeaveTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveTypeRepository extends JpaRepository<LeaveTypeEntity,Integer> {
}
