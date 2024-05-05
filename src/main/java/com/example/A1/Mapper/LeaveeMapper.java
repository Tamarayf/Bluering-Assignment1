package com.example.A1.Mapper;

import com.example.A1.DTO.LeaveeDTO;
import com.example.A1.Entity.LeaveeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;




@Mapper
public interface LeaveeMapper {

        LeaveeMapper INSTANCE = Mappers.getMapper(LeaveeMapper.class);

        LeaveeDTO leaveeEntityToLeaveeDTO(LeaveeEntity leaveeEntity);

        LeaveeEntity leaveeDTOToLeaveeEntity(LeaveeDTO leaveeDTO);

}
