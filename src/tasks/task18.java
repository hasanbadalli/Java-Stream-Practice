package tasks;

import Model.Employee;
import datas.UserData;

import java.util.List;

public class task18 {
    //Increase the salary of all employees by 10% and collect the updated list.
    public static void main(String[] args) {
        List<Employee> employeeList = UserData.userList.stream().map(employee -> new Employee(
                employee.getId(),
                employee.getName(),
                employee.getSurname(),
                employee.getAge(),
                employee.getSalary() * 1.10
        )).toList();
        employeeList.forEach(System.out::println);
    }
}
