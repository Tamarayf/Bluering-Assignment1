package com.example.A1.Mapper;


import com.example.A1.DTO.LeaveTypeDTO;
import com.example.A1.Entity.LeaveTypeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LeaveTypeMapper {

    LeaveTypeMapper INSTANCE = Mappers.getMapper(LeaveTypeMapper.class);

    LeaveTypeDTO leaveTypeEntityToLeaveTypeDTO(LeaveTypeEntity leaveTypeEntity);

   LeaveTypeEntity leaveTypeDTOToLeaveTypeEntity(LeaveTypeDTO leaveTypeDTO);
}
