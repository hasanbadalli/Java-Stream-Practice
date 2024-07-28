package tasks;

import datas.UserData;

public class task25 {
    public static void main(String[] args) {
        String mergedNames = UserData.userList.stream()
                .map(employee -> employee.getName() + " " + employee.getSurname())
                .reduce("", (acc, name) -> acc.isEmpty() ? name : acc + ", " + name);

        System.out.println("Names and Surnames: " + mergedNames);
    }
}
