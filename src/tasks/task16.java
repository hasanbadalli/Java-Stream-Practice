package tasks;

import Model.Employee;
import datas.UserData;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class task16 {
    ///List the names of employees who are not employers.
    public static void main(String[] args) {
        List<String> nonEmployees = UserData.userList.stream().filter(employee -> !employee.isEmployer()).map(Employee::getName).toList();

        nonEmployees.forEach((name)-> System.out.println("Name: " + name));
    }
}
