package tasks;

import Model.Employee;
import datas.UserData;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Find the employee with hihghes salary
public class task3 {
    public static void main(String[] args) {
        Optional<Employee> highestSalaryUser = UserData.userList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        if(highestSalaryUser.isPresent()){
            System.out.println(highestSalaryUser.get());
        }else{
            System.out.println("List is empty");
        }
    }
}
