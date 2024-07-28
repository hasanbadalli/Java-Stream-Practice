package tasks;

import Model.Employee;
import datas.UserData;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static datas.UserData.userList;

public class task27 {
    public static void main(String[] args) {
        //Calculate the total number of years of experience for all employees
        Map<Employee, Long> experienceUsers = userList.stream()
                .collect(Collectors.toMap(
                        employee -> employee,
                        employee -> ChronoUnit.YEARS.between(employee.getStartDate(), LocalDate.now())
                ));

        experienceUsers.forEach((employee, experience) ->
                System.out.println(employee.getName() + " has " + experience + " years of experience.")
        );
    }
}
