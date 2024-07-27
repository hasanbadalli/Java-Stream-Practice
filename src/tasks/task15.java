package tasks;

import Model.Employee;
import datas.UserData;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class task15 {
    //Get a map of employee names to their respective salaries.
    public static void main(String[] args) {
        Map<String, Double> nameAndSalary = UserData.userList.stream().collect(Collectors.toMap(
            Employee::getName,
            Employee::getSalary,
                    (existing, replacement) -> existing
        ));

        nameAndSalary.forEach((name, salary)-> System.out.println("Name: " + name + " Salary: " + salary));
    }
}
