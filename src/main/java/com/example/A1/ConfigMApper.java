package com.example.A1;

import com.example.A1.Mapper.DepartmentMapper;
import com.example.A1.Mapper.EmployeeMapper;

import com.example.A1.Mapper.LeaveTypeMapper;
import com.example.A1.Mapper.LeaveeMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
@Mapper
class MapperConfig {

    @Bean
    public DepartmentMapper departmentMapper() {
        return Mappers.getMapper(DepartmentMapper.class);
    }

    @Bean
    public EmployeeMapper employeeMapper() {
        return Mappers.getMapper(EmployeeMapper.class);
    }
    @Bean
    public LeaveeMapper leaveeMapper() {
        return Mappers.getMapper(LeaveeMapper.class);
    }
    @Bean
    public LeaveTypeMapper leaveTypeMapper() {
        return Mappers.getMapper(LeaveTypeMapper.class);
    }
}