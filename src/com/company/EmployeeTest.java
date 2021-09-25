package com.company;
import java.util.Scanner;
public class EmployeeTest {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name,lastname;
        double salary;

        System.out.println("Enter employee1 Name:");
        name = keyboard.next();
        System.out.println("Enter employee1 LastName:");
        lastname = keyboard.next();
        System.out.println("Enter employee1 Salary:");
        salary = keyboard.nextDouble();

        Employee employee1 = new Employee(name,lastname,salary);

        System.out.println("Enter employee2 Name:");
        name = keyboard.next();
        System.out.println("Enter employee2 LastName:");
        lastname = keyboard.next();
        System.out.println("Enter employee2 Salary:");
        salary = keyboard.nextDouble();

        Employee employee2 = new Employee(name,lastname,salary);

        System.out.printf("%s %s monthly salary: $%.2f%n", employee1.getName(), employee1.getLastName(), (employee1.getSalary()));
        System.out.printf("%s %s monthly salary: $%.2f%n%n", employee2.getName(), employee2.getLastName(),
                (employee2.getSalary()));

        System.out.printf("%s %s yearly salary: $%.2f%n", employee1.getName(), employee1.getLastName(), (employee1.getSalary()*12));
        System.out.printf("%s %s yearly salary: $%.2f%n%n", employee2.getName(), employee2.getLastName(),
                (employee2.getSalary()*12));

        employee1.setSalary(employee1.getSalary()*12 * 1.10);
        employee2.setSalary(employee2.getSalary()*12 * 1.10);

        System.out.println("Yearly salaries + 10% \n");

        System.out.printf("%s %s yearly salary: $%.2f%n", employee1.getName(), employee1.getLastName(), employee1.getSalary());
        System.out.printf("%s %s yearly salary: $%.2f%n", employee2.getName(), employee2.getLastName(), employee2.getSalary());
    }
}
