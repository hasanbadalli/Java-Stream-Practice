package tasks;

import Model.Employee;
import datas.UserData;

import java.util.List;
import java.util.OptionalDouble;

public class task21
{
    public static void main(String[] args) {

        OptionalDouble averageSalary = UserData.userList.stream()
                .mapToDouble(Employee::getSalary)
                .average();


        if (averageSalary.isPresent()) {
            double avgSalaryValue = averageSalary.getAsDouble();

            List<Employee> maxSalaries = UserData.userList.stream()
                    .filter(employee -> employee.getSalary() > avgSalaryValue)
                    .toList();


            maxSalaries.forEach(employee ->
                    System.out.println(employee.getName() + " - Salary: " + employee.getSalary()));
        } else {
            System.out.println("Empty");
        }
    }

}
