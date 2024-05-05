package com.example.A1.Service;

import com.example.A1.DTO.LeaveTypeDTO;
import com.example.A1.DTO.LeaveeDTO;
import com.example.A1.Entity.LeaveTypeEntity;
import com.example.A1.Entity.LeaveeEntity;
import com.example.A1.Mapper.LeaveTypeMapper;
import com.example.A1.Mapper.LeaveeMapper;
import com.example.A1.Repository.LeaveTypeRepository;
import com.example.A1.Repository.LeaveeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.ZoneId;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



@Service
public class Service2Imp implements Service2 {

    @Autowired
    private LeaveeMapper leaveMapper;

    @Autowired
    private LeaveeRepository leaveRepository;


    @Autowired
    private LeaveTypeMapper leaveTypeMapper;

    @Autowired
    private LeaveTypeRepository leaveTypeRepository;


    public LeaveTypeEntity DefineLeaveType(LeaveTypeDTO leaveTypeDTO) {
        LeaveTypeEntity leaveTypeEntity = leaveTypeMapper.leaveTypeDTOToLeaveTypeEntity(leaveTypeDTO);
        return leaveTypeRepository.save(leaveTypeEntity);
    }


//if I use java.sql.date
//    public LeaveeEntity submitLeaveRequest(LeaveeDTO leaveeDTO) {
//        LeaveeEntity leavee = leaveMapper.leaveeDTOToLeaveeEntity(leaveeDTO);
//        // Calculate the number of days
//        LocalDate fromDate = leavee.getFromDate().toLocalDate();
//        LocalDate toDate = leavee.getToDate().toLocalDate();
//
//        long numberOfDays = ChronoUnit.DAYS.between(fromDate, toDate);
//        leavee.setNumberOfDays((int) numberOfDays);
//        LeaveeEntity savedLeave = leaveRepository.save(leavee);
//        return savedLeave;
//    }

    public LeaveeEntity submitLeaveRequest(LeaveeDTO leaveeDTO) {
        LeaveeEntity leavee = leaveMapper.leaveeDTOToLeaveeEntity(leaveeDTO);
        // Calculate the number of days
        LocalDate fromDate = leavee.getFromDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate toDate = leavee.getToDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        long numberOfDays = ChronoUnit.DAYS.between(fromDate, toDate);
        leavee.setNumberOfDays((int) numberOfDays);

        LeaveeEntity savedLeave = leaveRepository.save(leavee);
        return savedLeave;
    }
}







