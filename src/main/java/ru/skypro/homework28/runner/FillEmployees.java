package ru.skypro.homework28.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.skypro.homework28.service.EmployeeService;

@Component
public class FillEmployees implements CommandLineRunner {
    @Autowired
    private EmployeeService employeeService;

    @Override
    public void run(String... args) throws Exception {
        employeeService.add("Иванова", "Ивана", 30000, 1);
        employeeService.add("Петров", "Петрович", 35000, 1);
        employeeService.add("Семенов", "Семен", 40000, 2);
        employeeService.add("Павлов", "Павел", 45000, 2);
        employeeService.add("Богданова", "Дарья", 50000, 3);
        employeeService.add("Богданов", "Максим", 55000, 3);
    }
}
