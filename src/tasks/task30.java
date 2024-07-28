package tasks;

import Model.Employee;
import datas.UserData;
import enums.Department;
import enums.Position;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class task30 {
    public static void main(String[] args) {
        //Count the number of employees with each position.

        Map<Position, Long> positionCount = UserData.userList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getPosition,
                        Collectors.counting()
                ));

        positionCount.forEach(((position, aLong) -> System.out.println(position + ": " + aLong)));

    }
}
