package tasks;

import Model.Employee;
import datas.UserData;

import java.util.List;

///////get a list of employee names
public class task2 {
    public static void main(String[] args) {
        List<String> userNameList = UserData.userList.stream().map(Employee::getName).toList();
        userNameList.forEach(System.out::println);
    }
}
