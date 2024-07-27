package tasks;

import Model.Employee;
import datas.UserData;
import enums.Department;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class task7 {
    /// find the names of employees working in the IT department
    public static void main(String[] args) {
        List<String> itWorker = UserData.userList.stream().filter(employee -> employee.getDepartment()== Department.IT).map(Employee::getName).toList();
        System.out.println(itWorker);

    }
}
