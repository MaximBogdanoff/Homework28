package ru.skypro.homework28.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.skypro.homework28.model.Employee;
import ru.skypro.homework28.service.DepartmentService;
import ru.skypro.homework28.service.EmployeeService;


@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService service;
    private ru.skypro.homework28.model.Employee Employee;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity <Employee> createEmployee (String firstName,String lastName, int salary, int department) {
        if ((!StringUtils.isAlpha(firstName))&(!StringUtils.isAlpha(lastName))) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(EmployeeService.createEmployee(firstName,lastName, salary,department));
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllByDep(@RequestParam(required = false) Integer dep) {
        return dep == null ?
                ResponseEntity.ok(service.getAll())
                :
                ResponseEntity.ok(service.getAllByDepartment(dep));
    }

    @GetMapping("/max-salary")
    public Employee getMaxSalary(@RequestParam int department) {
        return service.getMaxSalary(department);
    }

    @GetMapping("/min-salary")
    public Employee getMinSalary(@RequestParam int department) {
        return service.getMinSalary(department);
    }
}


