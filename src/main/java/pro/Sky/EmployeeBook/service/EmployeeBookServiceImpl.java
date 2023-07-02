package pro.Sky.EmployeeBook.service;

import org.springframework.stereotype.Service;
import pro.Sky.EmployeeBook.Employee;
import pro.Sky.EmployeeBook.exeption.EmployeeAlreadyAddedException;
import pro.Sky.EmployeeBook.exeption.EmployeeNotFoundException;
import pro.Sky.EmployeeBook.exeption.EmployeeStorageIsFullException;

import java.util.*;

@Service
public class EmployeeBookServiceImpl implements EmployeeBookService {
    private final Map<String, Employee> employees;
    private int maxEmployees = 10;

    public EmployeeBookServiceImpl() {
        this.employees = new HashMap<>();
    }

    public Employee addNewEmployee(String firstName, String lastName, int departmentID, double salary) {
        Employee employee = new Employee(firstName, lastName, departmentID, salary);

        if (employees.size() >= maxEmployees) {
            throw new EmployeeStorageIsFullException("Штат сотрудников заполнен");
        }

        if (employees.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException("Сотрудник уже добавлен");
        }

        if (employees.size() < maxEmployees) {
            employees.put(employee.getFullName(), employee);
        }
        return employee;
    }

    public Employee removeEmployee(String firstName, String lastName, int departmentID, double salary) {
        Employee employee = new Employee(firstName, lastName, departmentID, salary);

        if (employees.containsKey(employee.getFullName())) {
            employees.remove(employee.getFullName());
            return employee;
        }

        if (!employees.containsKey(employee.getFullName())) {
            throw new EmployeeNotFoundException("Сотрудник не найден");
        }
        return employee;
    }

    public Employee findEmployee(String firstName, String lastName, int departmentID, double salary) {
        Employee employee = new Employee(firstName, lastName, departmentID, salary);

        if (employees.containsKey(employee.getFullName())) {
            return employees.get(employee.getFullName());
        }

        if (!employees.containsKey(employee.getFullName())) {
            throw new EmployeeNotFoundException("Сотрудник не найден");
        }
        return employee;
    }

    @Override
    public Map<String, Employee> printEmployee() {
        return employees;
    }

    @Override
    public List<Employee> allEmployee() {
        return null;
    }
}
