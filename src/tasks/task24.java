package tasks;

import Model.Employee;
import datas.UserData;
import enums.Department;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class task24 {
    public static void main(String[] args) {
        //Find the oldest employee in each department.
        Map<Department, Optional<Employee>> oldestEmployeeInEachDept = UserData.userList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingInt(Employee::getAge))
                ));

        oldestEmployeeInEachDept.forEach((department, employeeOpt) -> {
            employeeOpt.ifPresent(employee ->
                    System.out.println(department + " - Oldest Employee: " + employee.getName() + " " + employee.getSurname() + ", Age: " + employee.getAge()));
        });
    }
}
