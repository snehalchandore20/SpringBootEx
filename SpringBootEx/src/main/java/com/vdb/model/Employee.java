package com.vdb.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    private Integer empId;

//    public Integer getEmpId() {
//        return empId;
//    }

//    public Employee(Integer empId, String empName, double empSalary) {
//        this.empId = empId;
//        this.empName = empName;
//        this.empSalary = empSalary;
//    }
//
//    public Employee() {
//        super();
//    }
//
//    public void setEmpId(Integer empId) {
//        this.empId = empId;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "empId=" + empId +
//                ", empName='" + empName + '\'' +
//                ", empSalary=" + empSalary +
//                '}';
//    }
//
//    public String getEmpName() {
//        return empName;
//    }
//
//    public void setEmpName(String empName) {
//        this.empName = empName;
//    }
//
//    public double getEmpSalary() {
//        return empSalary;
//    }
//
//    public void setEmpSalary(double empSalary) {
//        this.empSalary = empSalary;
//    }

    private String empName;
    private double empSalary;


}
