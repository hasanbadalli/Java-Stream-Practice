package tasks;

import Model.Employee;
import datas.UserData;
import enums.Department;

import java.util.List;

public class task8 {
    //Group employees by department.
    public static void main(String[] args) {
        List<String> itWorker = UserData.userList.stream().filter(employee -> employee.getDepartment()== Department.IT).map(Employee::getName).toList();
        List<String> hrWorker = UserData.userList.stream().filter(employee -> employee.getDepartment()== Department.HR).map(Employee::getName).toList();
        List<String> salesWorker = UserData.userList.stream().filter(employee -> employee.getDepartment()== Department.SALES).map(Employee::getName).toList();
        List<String> financeWorker = UserData.userList.stream().filter(employee -> employee.getDepartment()== Department.FINANCE).map(Employee::getName).toList();
        List<String> marketingWorker = UserData.userList.stream().filter(employee -> employee.getDepartment()== Department.MARKETING).map(Employee::getName).toList();

        System.out.println(itWorker);
        System.out.println(hrWorker);
        System.out.println(salesWorker);
        System.out.println(financeWorker);
        System.out.println(marketingWorker);

    }
}
