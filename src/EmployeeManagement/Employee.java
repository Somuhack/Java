package EmployeeManagement;

public class Employee {
    private String Name;
    private int Age;
    private double Salary;

    Employee(String name, int age, double salary) {
        Name = name;
        Age = age;
        Salary = salary;
    }
    String getEmployeeDetails(){
        return "EmployeeDetails: Name :"+Name+" \nAge :"+Age+"\nSalary : "+Salary;
    }
}
