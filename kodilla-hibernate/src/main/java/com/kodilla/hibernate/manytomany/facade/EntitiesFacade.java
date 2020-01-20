package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class EntitiesFacade {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public void save(Company company) {
        companyDao.save(company);
    }

    public void delete(int company) {
        companyDao.delete(company);
    }


    public List<Employee> searchEmployee(String findEmployee) throws EntitiesFacadeException {
        List<Employee> lastname = employeeDao.retrieveWithLastname(findEmployee);
        if (lastname.isEmpty()) {
            throw new EntitiesFacadeException(EntitiesFacadeException.ERR_SEARCHEMPLOYEE_ERROR);
        }
        return lastname;
    }

    public List<Employee> searchEmployeeAny(String findEmployee) throws EntitiesFacadeException {
        List<Employee> anyLettersLastname = employeeDao.retrieveWithAnyLettersLastname(findEmployee);
        if (anyLettersLastname.isEmpty()) {
            throw new EntitiesFacadeException(EntitiesFacadeException.ERR_SEARCHEMPLOYEE_ERROR);
        }
        return anyLettersLastname;
    }

    public List<Company> searchCompany(String findCompany) throws EntitiesFacadeException {
        List<Company> threeFirstLetters = companyDao.retrieveWithThreeFirstLetters(findCompany);
        if (threeFirstLetters.size() < 1) {
            throw new EntitiesFacadeException(EntitiesFacadeException.ERR_SEARCHCOMPANY_ERROR);
        }
        return threeFirstLetters;
    }

    public List<Company> searchCompanyAny(String findCompany) throws EntitiesFacadeException {
        List<Company> anyLetters = companyDao.retrieveWithAnyLetters(findCompany);
        if (anyLetters.size() < 1) {
            throw new EntitiesFacadeException(EntitiesFacadeException.ERR_SEARCHCOMPANY_ERROR);
        }
        return anyLetters;
    }
}