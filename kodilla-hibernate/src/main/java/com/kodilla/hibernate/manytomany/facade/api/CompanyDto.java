package com.kodilla.hibernate.manytomany.facade.api;

import com.kodilla.hibernate.manytomany.Employee;

import java.util.ArrayList;
import java.util.List;

public class CompanyDto {
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public CompanyDto() {
    }

    public CompanyDto(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "CompanyDto{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
