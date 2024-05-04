package com.example.A1.DTO;

import lombok.Data;

import java.sql.Date;

@Data
public class LeaveDTO {

    private Integer id;
    private Integer leaveTypeId;
    private Date fromDate;
    private Date toDate;
    private Integer numberOfDays;
    private String note;
    private Integer employeeId;
}
