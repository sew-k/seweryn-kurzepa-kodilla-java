package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@NamedNativeQueries({
        @NamedNativeQuery(
                name = "Company.retrieveCompaniesWithThreeFirstCharsInName",
                query = "select * from COMPANIES where substring(COMPANY_NAME from 1 for 3) = :THREEFIRSTCHARS",
                resultClass = Company.class
        ),
        @NamedNativeQuery(
                name = "Company.retrieveCompaniesNameLike",
                query = "select * from COMPANIES where COMPANY_NAME like :TEXT",
                resultClass = Company.class
        )
})

@Entity
@Table(name = "COMPANIES")
public class Company {

    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}