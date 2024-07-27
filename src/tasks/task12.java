package tasks;

import Model.Employee;
import datas.UserData;

import java.util.List;

public class task12 {
    //Get the total salary of all employees.

    public static void main(String[] args) {
        double salary = UserData.userList.stream().map(Employee::getSalary).reduce(0.0, Double::sum);

        System.out.println(salary);
    }
}
