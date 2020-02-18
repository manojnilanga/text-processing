package com.accelaero.aeroconnect.textprocessor.dto.schedules.message;

import com.couchbase.client.java.repository.annotation.Field;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class EmployeeDTO {

    private int empID = 0;
    private String firstName = "";
    private String lastName = "";
    private String department = "";

}
