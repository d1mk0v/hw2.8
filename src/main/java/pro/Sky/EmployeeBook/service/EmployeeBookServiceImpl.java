package pro.Sky.EmployeeBook.service;

import org.springframework.stereotype.Service;
import pro.Sky.EmployeeBook.Employee;

import java.util.List;

@Service
public class EmployeeBookServiceImpl implements EmployeeBookService {
    private final List<Employee> employeeList;
    private final int maxEmployees;

    public EmployeeBookServiceImpl(List<Employee> employeeList, int maxEmployees) {
        this.employeeList = employeeList;
        this.maxEmployees = maxEmployees;
    }

    @Override
    public Employee addNewEmployee(String firstName, String lastName) {
        return null;
    }

    @Override
    public Employee removeEmployee(String firstName, String lastName) {
        return null;
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        return null;
    }
}
