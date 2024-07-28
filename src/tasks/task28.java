package tasks;

import Model.Employee;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static datas.UserData.userList;

public class task28 {
    public static void main(String[] args) {
        //Find the longest-serving employee.
        Optional<Employee> maxServingUser = userList.stream().max(Comparator.comparingLong(employee->ChronoUnit.YEARS.between(employee.getStartDate(), LocalDate.now())));
        if (maxServingUser.isPresent()) {
            System.out.println("Longest-serving employee: " + maxServingUser.get().getName());
        } else {
            System.out.println("No employees found.");
        }
    }
}
