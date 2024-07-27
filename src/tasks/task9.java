package tasks;

import Model.Employee;
import datas.UserData;
import enums.Department;

import java.util.List;

public class task9 {
    //Count the number of employees in each department.
    public static void main(String[] args) {
        long itWorker = UserData.userList.stream().filter(employee -> employee.getDepartment()== Department.IT).count();
        long hrWorker = UserData.userList.stream().filter(employee -> employee.getDepartment()== Department.HR).count();
        long salesWorker = UserData.userList.stream().filter(employee -> employee.getDepartment()== Department.SALES).count();
        long financeWorker = UserData.userList.stream().filter(employee -> employee.getDepartment()== Department.FINANCE).count();
        long marketingWorker = UserData.userList.stream().filter(employee -> employee.getDepartment()== Department.MARKETING).count();

        System.out.println(itWorker);
        System.out.println(hrWorker);
        System.out.println(salesWorker);
        System.out.println(financeWorker);
        System.out.println(marketingWorker);

    }
}
