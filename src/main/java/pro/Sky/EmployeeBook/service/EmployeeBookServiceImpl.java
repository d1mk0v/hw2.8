package pro.Sky.EmployeeBook.service;

import org.springframework.stereotype.Service;
import pro.Sky.EmployeeBook.Employee;
import pro.Sky.EmployeeBook.exeption.EmployeeAlreadyAddedException;
import pro.Sky.EmployeeBook.exeption.EmployeeNotFoundException;
import pro.Sky.EmployeeBook.exeption.EmployeeStorageIsFullException;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeBookServiceImpl implements EmployeeBookService {
    private final List<Employee> employeeList;
    private int maxEmployees = 10;

    public EmployeeBookServiceImpl() {
        this.employeeList = new ArrayList<>();
        this.maxEmployees = maxEmployees;
    }

    public Employee addNewEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);

        if (employeeList.size() < maxEmployees) {
            employeeList.add(employee);
        }

        if (employeeList.size() >= maxEmployees) {
            throw new EmployeeStorageIsFullException("Штат сотрудников заполнен");
        }

        if (employeeList.contains(employee)) {
            throw new EmployeeAlreadyAddedException("Сотрудник уже добавлен");
        }
        return employee;
    }

    public Employee removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);

        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
            return employee;
        }

        if (!employeeList.contains(employee)) {
            throw new EmployeeNotFoundException("Сотрудник не найден");
        }
        return employee;
    }

    public Employee findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);

        if (employeeList.contains(employee)) {
            return employee;
        }

        if (!employeeList.contains(employee)) {
            throw new EmployeeNotFoundException("Сотрудник не найден");
        }
        return employee;
    }
}
