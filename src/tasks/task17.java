package tasks;

import Model.Employee;
import datas.UserData;

import java.util.Map;
import java.util.stream.Collectors;

public class task17 {
    //Get a list of employees' full names (name + surname).
    public static void main(String[] args) {
        Map<String, String> nameAndSalary = UserData.userList.stream().collect(Collectors.toMap(
                Employee::getName,
                Employee::getSurname,
                (existing, replacement) -> existing
        ));

        nameAndSalary.forEach((name, surname)-> System.out.println("Name: " + name + " Surname: "  + surname));

    }
}
