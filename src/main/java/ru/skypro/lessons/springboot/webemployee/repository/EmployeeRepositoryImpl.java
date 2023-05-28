package ru.skypro.lessons.springboot.webemployee.repository;

import org.springframework.stereotype.Repository;
import ru.skypro.lessons.springboot.webemployee.pojo.Employee;
import ru.skypro.lessons.springboot.webemployee.repository.EmployeeRepository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private final List<Employee> employeeList = List.of(
            new Employee("Лиля", 50_000),
            new Employee("Алиса", 60_000),
            new Employee("Женя", 70_000),
            new Employee("Влад", 30_000));

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }
}
