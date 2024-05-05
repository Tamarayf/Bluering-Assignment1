package com.example.A1.Service;

import com.example.A1.DTO.LeaveTypeDTO;
import com.example.A1.DTO.LeaveeDTO;
import com.example.A1.Entity.LeaveTypeEntity;
import com.example.A1.Entity.LeaveeEntity;

public interface Service2 {


    LeaveTypeEntity DefineLeaveType(LeaveTypeDTO leaveTypeDTO);
    LeaveeEntity submitLeaveRequest(LeaveeDTO leaveeDTO);
}
