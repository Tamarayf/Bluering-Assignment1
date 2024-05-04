package com.example.A1.Mapper;


import com.example.A1.DTO.DepartmentDTO;
import com.example.A1.DTO.LeaveDTO;
import com.example.A1.Entity.DepartmentEntity;
import com.example.A1.Entity.LeaveEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LeaveMapper  {

    LeaveMapper INSTANCE = Mappers.getMapper(LeaveMapper.class);

   LeaveDTO leaveEntityToLeaveDTO(LeaveEntity leaveEntity);

    LeaveEntity leaveDTOToLeaveEntity(LeaveDTO leaveDTO);
}
