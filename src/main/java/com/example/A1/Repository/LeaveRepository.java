package com.example.A1.Repository;

import com.example.A1.Entity.LeaveEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<LeaveEntity,Integer> {
}
