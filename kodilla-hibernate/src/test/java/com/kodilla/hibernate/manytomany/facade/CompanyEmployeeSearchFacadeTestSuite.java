package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.management.Query;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CompanyEmployeeSearchFacadeTestSuite {

    @Autowired
    CompanyEmployeeSearchFacade companyEmployeeSearchFacade;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;


    @Test
    void testSearchCompanyByNameLike() {
        //Given
        Company company1 = new Company("Just Company");
        Company company2 = new Company("Next Company");
        Company company3 = new Company("Company S.A.");
        Company company4 = new Company("Next S.A.");
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        companyDao.save(company4);
        int id1 = company1.getId();
        int id2 = company2.getId();
        int id3 = company3.getId();
        int id4 = company4.getId();

        //When
        List<Company> resultCompanies = companyEmployeeSearchFacade.retrieveCompanyNameLike("ext");

        //Then
        Assertions.assertEquals(2, resultCompanies.size());

        //CleanUp
        companyDao.deleteById(id1);
        companyDao.deleteById(id2);
        companyDao.deleteById(id3);
        companyDao.deleteById(id4);
    }
    @Test
    void testSearchEmployeeByNameLike() {
        //Given
        Employee employee1 = new Employee("Janusz", "Brzęczyszczykiewicz");
        Employee employee2 = new Employee("Dacjusz", "Kot");
        Employee employee3 = new Employee("Marcin", "Kowalski");
        Employee employee4 = new Employee("Cezary", "Marchlewski");
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        employeeDao.save(employee4);
        int id1 = employee1.getId();
        int id2 = employee2.getId();
        int id3 = employee3.getId();
        int id4 = employee4.getId();

        //When
        List<Employee> resultEmployees1 = companyEmployeeSearchFacade.retrieveEmployeeNameLike("zary");
        List<Employee> resultEmployees2 = companyEmployeeSearchFacade.retrieveEmployeeNameLike("rzęczy");

        //Then
        Assertions.assertEquals(1, resultEmployees1.size());
        Assertions.assertEquals(1, resultEmployees2.size());

        //CleanUp
        employeeDao.deleteById(id1);
        employeeDao.deleteById(id2);
        employeeDao.deleteById(id3);
        employeeDao.deleteById(id4);
    }


}