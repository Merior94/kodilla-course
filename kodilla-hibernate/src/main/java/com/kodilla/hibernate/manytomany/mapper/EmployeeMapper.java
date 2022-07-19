package com.kodilla.hibernate.manytomany.mapper;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.api.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeMapper {

    public EmployeeDto mapToEmployeeDto(final Employee Employee){
        return new EmployeeDto(Employee.getFirstname(), Employee.getLastname(), Employee.getCompanies());
    }

    public List<EmployeeDto> mapToEmployeeDtoList(final List<Employee> employees){
        return employees.stream()
                .map(this::mapToEmployeeDto)
                .collect(Collectors.toList());
    }
}
