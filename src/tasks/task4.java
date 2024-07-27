package tasks;

import Model.Employee;
import datas.UserData;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;


public class task4 {
    public static void main(String[] args) {
        ///// Calculate the average salary of Employee

        /*
        //Other way
        double salary = UserData.userList.stream().map(Employee::getSalary).reduce(0.0, Double::sum);
        long employeeCount = UserData.userList.stream().count();
        double averageSalary = salary>0 ? (salary / employeeCount) : 0.0;
        System.out.println(averageSalary);
        */

        OptionalDouble averageSalary = UserData.userList.stream().mapToDouble(Employee::getSalary).average();
        if (averageSalary.isPresent()){
            System.out.println(averageSalary.getAsDouble());
        }else{
            System.out.println("Empty");
        }


    }
}
