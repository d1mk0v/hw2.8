package pro.Sky.EmployeeBook.service;

import pro.Sky.EmployeeBook.Employee;

public interface EmployeeBookService {
    Employee addNewEmployee(String firstName, String lastName);
    Employee removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);
}
