package com.accelaero.aeroconnect.textprocessor.repository;

import com.accelaero.aeroconnect.textprocessor.document.Employee;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;

import java.util.Optional;

public interface EmployeeRepository extends CouchbasePagingAndSortingRepository<Employee, Integer> {
    Optional<Employee> findEmployeeByEmpID(int empID);
}

