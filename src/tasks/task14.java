package tasks;

import Model.Employee;
import datas.UserData;

import java.util.Comparator;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class task14 {
    ///Get a list of the unique surnames of all employees.
    public static void main(String[] args) {
        Set<String> uniqueSurnames = UserData.userList.stream()
                .map(Employee::getSurname)
                .collect(Collectors.toSet());

        uniqueSurnames.forEach(System.out::println);

    }
}
