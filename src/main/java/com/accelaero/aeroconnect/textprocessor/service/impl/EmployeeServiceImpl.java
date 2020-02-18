package com.accelaero.aeroconnect.textprocessor.service.impl;

import com.accelaero.aeroconnect.textprocessor.document.Employee;
import com.accelaero.aeroconnect.textprocessor.repository.EmployeeRepository;
import com.accelaero.aeroconnect.textprocessor.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Integer> getEmpID(){
//        Sort sort = new Sort(Sort.Direction.ASC, Collections.singletonList("empID"));
        Iterable<Employee> employees = employeeRepository.findAll();
        List<Integer> empIDs = new ArrayList<>();
        employees.forEach(employee -> empIDs.add(employee.getEmpID()));
        return empIDs;
    }
}

