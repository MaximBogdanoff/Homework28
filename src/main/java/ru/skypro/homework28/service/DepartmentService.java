package ru.skypro.homework28.service;

import ru.skypro.homework28.model.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    public List<Employee> getAllByDepartment(int dep);

    public Map<Integer, List<Employee>> getAll(int dep);

    List<Employee> getEmployees(int i);

    Map<Integer, List<Employee>> getAll();

    Employee getMinSalary(int department);

    Employee getMaxSalary(int department);
}
