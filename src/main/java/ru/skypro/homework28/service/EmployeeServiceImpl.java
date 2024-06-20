package ru.skypro.homework28.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework28.exception.EmployeeAlreadyAddedException;
import ru.skypro.homework28.exception.EmployeeNotFoundException;
import ru.skypro.homework28.model.Employee;

import java.util.*;

import static ru.skypro.homework28.model.Employee.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final Map<String, Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new HashMap<>();
    }

    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Map<String, Employee> getEmployees() {
        return employees;
    }

    public EmployeeServiceImpl(Map<String, Employee> employees) {
        this.employees = employees;
    }

    public EmployeeServiceImpl(Map<String, Employee> employees, List<Employee> employeeList) {
        this.employees = employees;
        this.employeeList = employeeList;
    }

    @Override
    public Employee maxSalary(String firstName, String lastName, int salary, int department) {
        return null;
    }

    @Override
    public Employee minSalary(String firstName, String lastName, int salary, int department) {
        return null;
    }

    @Override
    public Employee add(String firstName, String lastName, int salary, int department) {
        Employee employee = new Employee(firstName, lastName, salary, department);
        if (employees.containsKey(getFullName())) {
            throw new EmployeeAlreadyAddedException();
        }
        employees.put(getFullName(), employee);
        return employee;
    }

    @Override
    public Employee remove(String firstName, String lastName, int salary, int department) {
        Employee employee = new Employee(firstName,lastName, salary, department);
        if (employees.containsKey(getFullName())) {
            employees.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException("");
    }

    @Override
    public Employee find(String firstName, String lastName, int salary, int department) {
        Employee employee = new Employee(firstName, lastName, salary, department);
        if (employees.containsKey(getFullName())) {
            return employees.get(getFullName());
        }
        throw new EmployeeNotFoundException("");
    }

    @Override
    public Collection<Employee> findAll(String firstName, String lastname, int salary, int department) {
        return Collections.unmodifiableCollection(employees.values());
    }

    @Override
    public Collection<Employee> maxSalary() {
        return null;
    }

    @Override
    public Collection<Employee> minSalary() {
        return null;
    }

    @Override
    public List<Employee> list() {
        return null;
    }

    @Override
    public void remove(String firstName, String lastName) {

    }


    @Override
    public void find(String firstName, String lastName) {

    }

    public Employee createEmployee(String getFullName,int salary, int department) {
        Employee employee = new Employee(getFullName, salary, department);
        Employee put = employees.put(getFullName, employee);
        return employees.get(getFullName());
    }
}