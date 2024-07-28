package tasks;

import Model.Employee;
import datas.UserData;

public class task29 {
    public static void main(String[] args) {
        //Reduce the list of employees to get the combined salary of all employees.
        Double totalSalary = UserData.userList.stream().map(Employee::getSalary).reduce(0.0, Double::sum);
        System.out.println(totalSalary);
    }
}
