package com.vdb.controller;

import com.vdb.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import java.util.stream.Stream;

@RestController
@RequestMapping("/employees")

public class EmployeeController {
    List<Employee> employeeList = Stream.of(new Employee(1,"qwerrt",20888.67),
            new Employee(2,"ABC",30456.56),
            new Employee(3,"XYZ",45677.23)).toList();

    @GetMapping("/findall")
    public ResponseEntity<List<Employee>> findAll(){
        return  ResponseEntity.ok(employeeList);
    }

    @GetMapping("/sortbyname")
    public ResponseEntity<List<Employee>> sortByName()
    {
        return ResponseEntity.ok(employeeList.stream().sorted(Comparator.comparing(Employee::getEmpName)).toList());
    }

}
