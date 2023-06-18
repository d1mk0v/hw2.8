package pro.Sky.EmployeeBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//Какие задачи нужно выполнить:
//
//        1. Перенести из курсовой работу с коллекцией сотрудников в сервис на базе веб-приложения на Spring.
//        2. Заменить сообщения об ошибках выбросом исключений.
//        3. Заменить массивы в коде на любую подходящую коллекцию.

//        Шаг 1+
//        Создать Spring Boot проект.
//
//        Шаг 2+
//        Подключить модуль Spring Web.
//
//        Шаг 3
//        Перенести из курсовой класс Employee, оставив в нем только поля firstName и lastName, конструктор, геттеры и методы hashCode, equals, toString.
//
//        Шаг 4
//        Создать сервис EmployeeService, который хранит внутри поле с коллекцией сотрудников и константу хранящее максимальное возможное количество
//        сотрудников в фирме.
//
//        Шаг 5
//        Реализовать в сервисе три метода, которые принимают в качестве параметров firstName и lastName:
//              1. Добавить сотрудника.
//              2. Удалить сотрудника.
//              3. Найти сотрудника.
//
//        Шаг 6
//        Написать собственное непроверяемое исключение EmployeeNotFoundException, которое выбрасывается, если сотрудник не найден.
//
//        Шаг 7
//        Написать собственное непроверяемое исключение EmployeeStorageIsFullException, которое выбрасывается, если превышен лимит количества сотрудников в фирме.
//
//        Шаг 8
//        Написать собственное непроверяемое исключение EmployeeAlreadyAddedException, которое выбрасывается, когда нового сотрудника пытаются добавить
//        в коллекцию, а в коллекции уже есть такой сотрудник.
//
//        Шаг 9
//        Добавить в методы из шага 5 новые исключения:
//              1. В метод с добавлением сотрудника нужно добавить выброс исключения из шага 7 в ситуации, когда коллекция переполнена.
//              2. В метод с добавлением сотрудника нужно добавить выброс исключения из шага 8 в ситуации, когда добавляемый сотрудник уже имеется в коллекции.
//              3. В метод с удалением сотрудника нужно добавить выброс исключения из шага 6 в ситуации, когда удаляемый сотрудник не найден.
//              4. В метод с поиском сотрудника нужно добавить выброс исключения из шага 6 в ситуации, когда сотрудник не найден.
//
//        Шаг 10
//        Реализовать EmployeeController, который имеет поле EmployeeService.
//        Объявить конструктор с этим параметром, чтобы заинджектить EmployeeService в EmployeeController.
//
//        Шаг 11
//        Объявить в контроллере 3 метода:
//              1. По адресу /employee/add?firstName=Ivan&lastName=Ivanov должен вернуться объект Employee в формате JSON,
//                 т.е. { "firstName": "Ivan", "lastName": "Ivanov" }, или исключение ArrayIsFull в случае переполнения коллекции
//                 или EmployeeAlreadyAdded в случае, когда сотрудник уже существует.
//              2. По адресу /employee/remove?firstName=Ivan&lastName=Ivanov должен вернуться объект Employee в формате JSON,
//                 т.е. { "firstName": "Ivan", "lastName": "Ivanov" }, или исключение со статусом EmployeeNotFound, если сотрудник отсутствует.
//              3. По адресу /employee/find?firstName=Ivan&lastName=Ivanov должен вернуться объект Employee в формате JSON,
//                 т.е. { "firstName": "Ivan", "lastName": "Ivanov" }, или исключение со статусом EmployeeNotFound, если такой сотрудник отсутствует.
//
//        Шаг 12
//        Написать метод, который выводит в браузер список всех сотрудников в формате JSON (необходимо вернуть объект списка).
//
//        - Подсказки
//        1. Сервис должен быть помечен аннотацией @Service.
//        2. Контроллер должен быть помечен аннотацией @RestController.
//        3. Возврат статуса осуществляется с помощью аннотации @ResponseStatus.
//        4. Никакой логики в контроллере быть не должно. Всю работу с коллекцией выполняет сервис, а контроллер только формирует сообщение
//           с результатом работы сервиса.
//        5. В случае отсутствия одного из параметров Spring должен самостоятельно выводить страницу с ошибкой (аннотация @RequestParam).
//        6. Чтобы не вводить часть с /employee в каждый @GetMapping, следует использовать аннотацию @RequestMapping на уровне контроллера.
//        7. Spring сам конвертирует ваш объект Employee в JSON. Достаточно просто вернуть его через return в методе контроллера.


@SpringBootApplication
public class EmployeeBookApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeBookApplication.class, args);
    }

}
