package com.kodilla.hibernate.manytomany.facade.api;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.mapper.CompanyMapper;
import com.kodilla.hibernate.manytomany.mapper.EmployeeMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyToManyFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(ManyToManyFacade.class);
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;
    private final CompanyMapper companyMapper;
    private final EmployeeMapper employeeMapper;

    @Autowired
    public ManyToManyFacade(CompanyDao companyDao, EmployeeDao employeeDao, CompanyMapper companyMapper, EmployeeMapper employeeMapper) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
        this.companyMapper = companyMapper;
        this.employeeMapper = employeeMapper;
    }

    public List<CompanyDto> findCompany(String name) throws ItemNotFoundException{
        List<Company> companies = companyDao.retrieveByName(name);
        if (companies.isEmpty()){
            throw new ItemNotFoundException(ItemNotFoundException.ERR_COMPANY_NOT_FOUND);
        }
        return companyMapper.mapToCompanyDtoList(companies);
    }

    public List<EmployeeDto> findEmployee(String name) throws ItemNotFoundException{
        List<Employee> employees = employeeDao.retrieveByName(name);
        if (employees.isEmpty()){
            throw new ItemNotFoundException(ItemNotFoundException.ERR_EMPLOYEE_NOT_FOUND);
        }
        return employeeMapper.mapToEmployeeDtoList(employees);
    }
}
