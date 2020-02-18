package com.accelaero.aeroconnect.textprocessor.document;

import com.couchbase.client.java.repository.annotation.Field;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
@Getter
@Setter
public class Employee {

    @Id
    private int empID = 0;

    @Field
    private String firstName = "";

    @Field
    private String lastName = "";

    @Field
    private String department = "";

}


