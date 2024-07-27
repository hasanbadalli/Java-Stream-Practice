package tasks;

import Model.Employee;
import datas.UserData;

import java.util.Comparator;
import java.util.Optional;

public class task13 {
    //Find the employee with the lowest salary.
    public static void main(String[] args) {
        Optional<Employee> lowestSalaryEmployee = UserData.userList.stream()
                .min(Comparator.comparingDouble(Employee::getSalary));


        lowestSalaryEmployee.ifPresent(employee ->
                System.out.println("Employee with the lowest salary: " + employee.getName() +
                        ", Salary: " + employee.getSalary()));

        if (!lowestSalaryEmployee.isPresent()) {
            System.out.println("No employees found.");
        }

    }


}
