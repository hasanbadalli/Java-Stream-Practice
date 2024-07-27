package tasks;

import Model.Employee;
import datas.UserData;
import enums.Department;

public class task19 {
    public static void main(String[] args) {
        //Find the sum of the salaries of all employees in the IT department.
        double salary = UserData.userList.stream().filter(employee -> employee.getDepartment() == Department.IT).map(Employee::getSalary).reduce(0.0, Double::sum);

        System.out.println(salary);
    }
}
