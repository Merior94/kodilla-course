package com.kodilla.hibernate.manytomany.facade.api;

import com.kodilla.hibernate.manytomany.Company;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDto {

    private String firstname;
    private String lastname;
    private List<Company> companies = new ArrayList<>();

    public EmployeeDto(String firstname, String lastname, List<Company> companies) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.companies = companies;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", companies=" + companies +
                '}';
    }
}
