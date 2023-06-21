package pro.Sky.EmployeeBook.service;

import pro.Sky.EmployeeBook.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeBookService {
    Employee addNewEmployee(String firstName, String lastName);
    Employee removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);

    Map<String, Employee> printEmployee();
}
