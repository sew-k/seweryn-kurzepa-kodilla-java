package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
    @Test
    void testEmployeeNamedQuery() {
        //Given
        Employee employee1 = new Employee("Jan", "Kowalski");
        Employee employee2 = new Employee("Janusz", "Nowak");
        Employee employee3 = new Employee("Adrian", "Kowalski");
        Employee employee4 = new Employee("Janina", "Kowalska");
        Company company = new Company("Simple Company Sp z o.o.");
        company.getEmployees().add(employee1);
        company.getEmployees().add(employee2);
        company.getEmployees().add(employee3);
        company.getEmployees().add(employee4);
        employee1.setCompanies(Arrays.asList(company));
        employee2.setCompanies(Arrays.asList(company));
        employee3.setCompanies(Arrays.asList(company));
        employee4.setCompanies(Arrays.asList(company));
        companyDao.save(company);
        int companyId = company.getId();

        //When
        List<Employee> familyMembers = employeeDao.retrieveEmployeeByLastname("Kowalski");

        //Then
        Assertions.assertTrue(familyMembers.size() >= 2);

        //CleanUp
        companyDao.deleteById(companyId);
    }
    @Test
    void testCompanyNamedQuery() {
        //Given
        Employee employee = new Employee("Jan", "Kowalski");
        Company company1 = new Company("Simple Company Sp z o.o.");
        Company company2 = new Company("Geo Complex S.A.");
        Company company3 = new Company("GeoMatics Sp z o.o.");
        Company company4 = new Company("NaviGEO");
        company1.getEmployees().add(employee);
        company2.getEmployees().add(employee);
        company3.getEmployees().add(employee);
        company4.getEmployees().add(employee);
        employee.setCompanies(Arrays.asList(company1, company2, company3, company4));
        employeeDao.save(employee);
        int employeeId = employee.getId();

        //When
        List<Company> geoSpatialCompanies = companyDao.retrieveCompaniesWithThreeFirstCharsInName("Geo");

        //Then
        Assertions.assertTrue(geoSpatialCompanies.size() >= 2);

        //CleanUp
        employeeDao.deleteById(employeeId);
    }
}
