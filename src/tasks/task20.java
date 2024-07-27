package tasks;

import Model.Employee;
import datas.UserData;
import enums.Department;

import java.util.Map;
import java.util.stream.Collectors;

public class task20
{
    public static void main(String[] args) {
        //Group employees by department and calculate the total salary for each department.
        Map<Department, Double> totalSalaryByDepartment = UserData.userList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.reducing(
                                0.0,
                                Employee::getSalary,
                                Double::sum
                        )
                ));

        System.out.println(totalSalaryByDepartment);
    }
}
