package tasks;

import Model.Employee;
import datas.UserData;

import java.util.Comparator;
import java.util.List;

public class task23 {
    public static void main(String[] args) {
        //Get the names of employees sorted by their salary in descending order.
        List<String> employees = UserData.userList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).map(Employee::getName).toList();
        employees.forEach(System.out::println);
    }
}
