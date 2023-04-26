package com.employee.employee.system.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
    public int empId;
    public String name;
    public String lastName;
    public String email;
    public String department;
    public String contactNo;

    public Employee(){

    }
    public Employee(int empId, String name, String lastName, String email, String department, String contactNo) {
        this.empId = empId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.contactNo = contactNo;
}
@Id
@GeneratedValue
public int getEmpId(){
    return empId;
}
public void setEmpId(int empId){
    this.empId = empId;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}
public String getLastName(){
    return lastName;
}
public void setLastName(String lastName){
    this.lastName = lastName;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email = email;
}
public String getDepartment(){
    return department;
}
public void setDepartment(String department){
    this.department = department;
}
public String getContactNo(){
    return contactNo;
}
public void setContactNo(String contactNo){
    this.contactNo = contactNo;
}
}