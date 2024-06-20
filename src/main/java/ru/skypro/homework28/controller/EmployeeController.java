package ru.skypro.homework28.controller;

import org.springframework.web.bind.annotation.*;
import ru.skypro.homework28.model.Employee;
import ru.skypro.homework28.service.EmployeeService;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }


    @GetMapping("/createEmployee")
    public Employee createEmployee (String firstName, String lastName, int salary, int department){
     return EmployeeService.createEmployee(firstName, lastName,salary,department);
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String firstName,
                                @RequestParam String lastName,
                                @RequestParam int salary,
                                @RequestParam int department) {
        return service.add(firstName, lastName, salary, department);
    }


    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam String firstName,
                                   @RequestParam String lastName,
                                   @RequestParam int salary,
                                   @RequestParam int department) {
        return service.remove(firstName, lastName, salary, department);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam String firstName,
                                 @RequestParam String lastName,
                                 @RequestParam int salary,
                                 @RequestParam int department) {
        return service.find(firstName, lastName, salary, department);
    }

    @GetMapping("/findAll")
    public Collection<Employee> findAllEmployee(@RequestParam String firstName,
                                                @RequestParam String lastname,
                                                @RequestParam int salary,
                                                @RequestParam int department) {
        return service.findAll(firstName,lastname,salary,department);
    }


}