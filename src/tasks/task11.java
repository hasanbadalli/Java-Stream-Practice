package tasks;

import Model.Employee;
import datas.UserData;
import enums.Department;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class task11 {
    //Partition employees into employers and non-employers.
    public static void main(String[] args) {
        List<Employee> employees = UserData.userList.stream().filter(Employee::isEmployer).toList();
        List<Employee> nonEmployees = UserData.userList.stream().filter(employee -> !employee.isEmployer()).toList();

        employees.forEach(System.out::println);
        System.out.println("------------------------");
        nonEmployees.forEach(System.out::println);



    }
}
