package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EntitiesFacadeTestSuite {

    @Autowired
    EntitiesFacade entitiesFacade;

    @Test
    public void facadeCompanyTest() {
        //Given
        Employee johnSmith1 = new Employee("John", "Smith");
        Employee stephanieClarckson1 = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky1 = new Employee("Linda", "Kovalsky");

        Company softwareMachine1 = new Company("Software Machine");
        Company dataMaesters1 = new Company("Data Maesters");
        Company greyMatter1 = new Company("Grey Matter");

        softwareMachine1.getEmployees().add(johnSmith1);
        dataMaesters1.getEmployees().add(stephanieClarckson1);
        dataMaesters1.getEmployees().add(lindaKovalsky1);
        greyMatter1.getEmployees().add(johnSmith1);
        greyMatter1.getEmployees().add(lindaKovalsky1);

        johnSmith1.getCompanies().add(softwareMachine1);
        johnSmith1.getCompanies().add(greyMatter1);
        stephanieClarckson1.getCompanies().add(dataMaesters1);
        lindaKovalsky1.getCompanies().add(dataMaesters1);
        lindaKovalsky1.getCompanies().add(greyMatter1);

        entitiesFacade.save(softwareMachine1);
        int softwareMachineId = softwareMachine1.getId();
        entitiesFacade.save(dataMaesters1);
        int dataMaestersId = dataMaesters1.getId();
        entitiesFacade.save(greyMatter1);
        int greyMatterId = greyMatter1.getId();

        //When
        List<Company> threeFirstLetters = null;
        try {
            threeFirstLetters = entitiesFacade.searchCompany("Dat");
        } catch (EntitiesFacadeException e) {
            e.printStackTrace();
        }

        List<Company> anyLetters = null;
        try {
            anyLetters = entitiesFacade.searchCompanyAny("rey");
        } catch (EntitiesFacadeException e) {
            e.printStackTrace();
        }

        //Than
        try {
            Assert.assertEquals(1, threeFirstLetters.size());
            Assert.assertEquals(2, anyLetters.size());

            //CleanUp
            entitiesFacade.delete(softwareMachineId);
            entitiesFacade.delete(dataMaestersId);
            entitiesFacade.delete(greyMatterId);
        } catch (Exception e){
        }
    }

    @Test
    public void facadeEmployeeTest() {
        //Given
        Employee johnSmith1 = new Employee("John", "Smith");
        Employee stephanieClarckson1 = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky1 = new Employee("Linda", "Kovalsoky");

        Company softwareMachine1 = new Company("Software Machine");
        Company dataMaesters1 = new Company("Data Maesters");
        Company greyMatter1 = new Company("Grey Matter");

        softwareMachine1.getEmployees().add(johnSmith1);
        dataMaesters1.getEmployees().add(stephanieClarckson1);
        dataMaesters1.getEmployees().add(lindaKovalsky1);
        greyMatter1.getEmployees().add(johnSmith1);
        greyMatter1.getEmployees().add(lindaKovalsky1);

        johnSmith1.getCompanies().add(softwareMachine1);
        johnSmith1.getCompanies().add(greyMatter1);
        stephanieClarckson1.getCompanies().add(dataMaesters1);
        lindaKovalsky1.getCompanies().add(dataMaesters1);
        lindaKovalsky1.getCompanies().add(greyMatter1);

        entitiesFacade.save(softwareMachine1);
        int softwareMachineId = softwareMachine1.getId();
        entitiesFacade.save(dataMaesters1);
        int dataMaestersId = dataMaesters1.getId();
        entitiesFacade.save(greyMatter1);
        int greyMatterId = greyMatter1.getId();

        //When
        List<Employee> lastname = null;
        try {
            lastname = entitiesFacade.searchEmployee("Smith");
        } catch (EntitiesFacadeException e) {
            e.printStackTrace();
        }

        List<Employee> anyLettersLastname = null;
        try {
            anyLettersLastname = entitiesFacade.searchEmployeeAny("val");
        } catch (EntitiesFacadeException e) {
            e.printStackTrace();
        }

        // Then

        Assert.assertEquals(1, lastname.size());
        Assert.assertEquals(2, anyLettersLastname.size());
    }
}