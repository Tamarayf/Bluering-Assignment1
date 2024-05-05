package com.example.A1.Controller;


import com.example.A1.Apiresponse;
import com.example.A1.DTO.DepartmentDTO;
import com.example.A1.DTO.LeaveTypeDTO;
import com.example.A1.DTO.LeaveeDTO;
import com.example.A1.Entity.DepartmentEntity;
import com.example.A1.Entity.LeaveTypeEntity;
import com.example.A1.Entity.LeaveeEntity;
import com.example.A1.Service.Service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller2 {


    private final Service2 service2;

    @Autowired
    public Controller2(Service2 service2) {
        this.service2 = service2;
    }



    @PostMapping("/leaveType/")
    public Apiresponse DefineLeaveType(@RequestBody LeaveTypeDTO leaveTypeDTO) {
       LeaveTypeEntity definedLeaveType = service2.DefineLeaveType(leaveTypeDTO);
        return new Apiresponse(true, "LeaveType created successfully", definedLeaveType.getIdLeaveType());
    }

    @PostMapping("/Leave/")
    public Apiresponse submitLeaveRequest(@RequestBody LeaveeDTO leaveDTO) {
        try {
            LeaveeEntity savedLeave = service2.submitLeaveRequest(leaveDTO);
            return new Apiresponse(true, "Leave request submitted successfully", savedLeave);
        } catch (Exception e) {
            return new Apiresponse(false, "Failed to submit leave request: " + e.getMessage(), null);
        }

    }
}

