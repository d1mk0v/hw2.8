package pro.Sky.EmployeeBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//        Цель сегодняшней домашней работы — научиться менять реализацию через циклы на Steam API.
//
//        Шаг 1. Добавить в поле Employee поля «Зарплата» и «Отдел» из курсовой работы.+
//        Шаг 2. В текущий проект на Spring перенести методы работы с отделами из курсовой работы.
//        Шаг 3. Заменить реализацию через циклы на Stream API. Написать новый контроллер и сервис, которые будут:
//              1. Возвращать сотрудника с максимальной зарплатой на основе номера отдела, который приходит в запрос из браузера.
//                 /departments/max-salary?departmentId=5
//              2. Возвращать сотрудника с минимальной зарплатой на основе номера отдела.
//                 /departments/min-salary?departmentId=5
//              3. Возвращать всех сотрудников по отделу.
//                 /departments/allInDepartment?departmentId=5
//              4. Возвращать всех сотрудников с разделением по отделам.
//                 /departments/all

@SpringBootApplication
public class EmployeeBookApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeBookApplication.class, args);
    }

}
