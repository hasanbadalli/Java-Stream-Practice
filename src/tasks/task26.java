package tasks;

import Model.Employee;
import datas.UserData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class task26 {
    public static void main(String[] args) {
        //Flatten a list of lists of employees and collect the results.
        List<List<Employee>> nestedlist = Arrays.asList(UserData.userList);
        List<Employee> userList = nestedlist.stream().flatMap(Collection::stream).toList();

        System.out.println(userList);
    }
}
