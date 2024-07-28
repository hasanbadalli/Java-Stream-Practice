package tasks;

import Model.Employee;
import datas.UserData;

import java.util.Map;
import java.util.stream.Collectors;

public class task22
{
    public static void main(String[] args) {
        //Convert the list of employees to a map where the key is the employee's ID and the value is the employee object.
        Map<Integer, Employee> users = UserData.userList.stream().collect(Collectors.toMap(Employee::getId, employee -> employee));
        users.forEach((id, employee)-> System.out.println(id + ". " + employee));
    }
}
