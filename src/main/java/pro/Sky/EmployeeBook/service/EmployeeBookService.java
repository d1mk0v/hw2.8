package pro.Sky.EmployeeBook.service;

import pro.Sky.EmployeeBook.Employee;

import java.util.Map;

public interface EmployeeBookService {
    Employee addNewEmployee(String firstName, String lastName, int department, double salary);
    Employee removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);

    Map<String, Employee> printEmployee();
}
