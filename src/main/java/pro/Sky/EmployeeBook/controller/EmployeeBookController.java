package pro.Sky.EmployeeBook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.Sky.EmployeeBook.Employee;
import pro.Sky.EmployeeBook.service.EmployeeBookService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeBookController {
    private final EmployeeBookService employeeBookService;

    public EmployeeBookController(EmployeeBookService employeeBookService) {
        this.employeeBookService = employeeBookService;
    }

    @GetMapping(path = "/add")
    public Employee addNewEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        return employeeBookService.addNewEmployee(firstName, lastName);
    }

    @GetMapping(path = "/remove")
    public Employee removeEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        return employeeBookService.removeEmployee(firstName, lastName);
    }

    @GetMapping(path = "/find")
    public Employee findEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        return employeeBookService.findEmployee(firstName, lastName);
    }

    @GetMapping()
    public List<Employee> printEmployee() {
        return employeeBookService.printEmployee();
    }
}
