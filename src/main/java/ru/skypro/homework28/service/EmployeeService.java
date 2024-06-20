package ru.skypro.homework28.service;

import ru.skypro.homework28.model.Employee;

import java.util.Collection;
import java.util.List;

public interface EmployeeService {


    static Employee createEmployee(String getFullName, String lastName, int salary, int department) {
        return null;
    }

    Employee maxSalary(String firstName, String lastName, int salary, int department);

    Employee minSalary(String firstName, String lastName, int salary, int department);

    Employee add(String firstName, String lastName, int salary, int department);

    Employee remove(String firstName, String lastName, int salary, int department);

    Employee find(String firstName, String lastName, int salary, int department);

    Collection<Employee> findAll(String firstName, String lastname, int salary, int department);

    Collection<Employee> maxSalary();

    Collection<Employee> minSalary();

    List<Employee> list();

    void remove(String firstName, String lastName);

    void find(String firstName, String lastName);

    static Employee createEmployee(String getFullName, int salary, int department) {
        return null;
    }

}
