package tasks;

import Model.Employee;
import datas.UserData;
import enums.Department;

import java.util.OptionalDouble;

public class task10 {
    //Find the average age of employees in each department.
    public static void main(String[] args) {
        OptionalDouble itWorker = UserData.userList.stream().filter(employee -> employee.getDepartment()== Department.IT).mapToDouble(Employee::getAge).average();
        OptionalDouble hrWorker = UserData.userList.stream().filter(employee -> employee.getDepartment()== Department.HR).mapToDouble(Employee::getAge).average();
        OptionalDouble salesWorker = UserData.userList.stream().filter(employee -> employee.getDepartment()== Department.SALES).mapToDouble(Employee::getAge).average();
        OptionalDouble financeWorker = UserData.userList.stream().filter(employee -> employee.getDepartment()== Department.FINANCE).mapToDouble(Employee::getAge).average();
        OptionalDouble marketingWorker = UserData.userList.stream().filter(employee -> employee.getDepartment()== Department.MARKETING).mapToDouble(Employee::getAge).average();

        itWorker.ifPresent(avg -> System.out.println("IT Department Average Age: " + avg));
        hrWorker.ifPresent(avg -> System.out.println("HR Department Average Age: " + avg));
        salesWorker.ifPresent(avg -> System.out.println("Sales Department Average Age: " + avg));
        financeWorker.ifPresent(avg -> System.out.println("Finance Department Average Age: " + avg));
        marketingWorker.ifPresent(avg -> System.out.println("Marketing Department Average Age: " + avg));

    }
}
