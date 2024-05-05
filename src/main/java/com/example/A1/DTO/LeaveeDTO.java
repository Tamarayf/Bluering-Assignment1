package com.example.A1.DTO;

import lombok.Data;



import java.util.Date;

@Data
public class LeaveeDTO {

    private Integer leaveId;
    private Integer leaveTypeId;
    private Date fromDate;
    private Date toDate;
    private Integer numberOfDays;
    private String note;
    private Integer employeeId;

}
