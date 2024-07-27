package tasks;

import Model.Employee;
import datas.UserData;

import java.util.List;


//Filter employees by age greater than 30.
public class task1 {
    public static void main(String[] args) {
        List<Employee> newUserList = UserData.userList.stream().filter(employee -> employee.getAge() > 30).toList();
        newUserList.forEach(user -> System.out.println(user.toString()));
    }
}
