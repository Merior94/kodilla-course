package com.kodilla.hibernate.manytomany.mapper;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.facade.api.CompanyDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyMapper {

    public CompanyDto mapToCompanyDto(final Company company){
        return new CompanyDto(company.getName(),company.getEmployees());
    }

    public List<CompanyDto> mapToCompanyDtoList(final List<Company> companies){
        return companies.stream()
                .map(this::mapToCompanyDto)
                .collect(Collectors.toList());
    }
}
