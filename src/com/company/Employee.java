package com.company;

public class Employee {
    private String name;
    private String lastName;
    private double salary;
/**конструктор*/
    public Employee(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }
/**геттеры*/
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
            return salary;
    }


/**сеттеры*/
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        if (salary > 0.0)
            this.salary = salary;
    }
}
