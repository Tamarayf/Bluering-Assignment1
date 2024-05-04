package com.example.A1.Mapper;

import com.example.A1.DTO.EmployeeDTO;
import com.example.A1.Entity.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;


@Mapper
@Component

public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    EmployeeDTO employeeEntityToEmployeeDTO(EmployeeEntity employeeEntity);
    EmployeeEntity employeeDTOToEmployeeEntity (EmployeeDTO employeeDTO);
}
