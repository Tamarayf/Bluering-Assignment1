package com.example.A1.Mapper;

import com.example.A1.DTO.DepartmentDTO;
import com.example.A1.Entity.DepartmentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface DepartmentMapper {

    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);

    DepartmentDTO departmentEntityToDepartmentDTO(DepartmentEntity departmentEntity);

    DepartmentEntity departmentDTOToDepartmentEntity(DepartmentDTO departmentDTO);
}
