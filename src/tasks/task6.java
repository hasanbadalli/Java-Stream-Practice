package tasks;

import Model.Employee;
import datas.UserData;

import java.util.function.Predicate;


//// check if all employer age bigger than 25
public class task6 {
    public static void main(String[] args) {
        Predicate<Employee> checkAge = employee-> employee.getAge() > 25;
        boolean result = UserData.userList.stream().allMatch(checkAge);
        System.out.println(result);
    }
}
