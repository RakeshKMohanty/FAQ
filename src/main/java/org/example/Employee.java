package org.example;

public class Employee {

    int id;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }

    String name;
    long salary;
    String dept;

    public Employee(int id, String name, long salary, String dept) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.dept = dept;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public String getDept(){
        return dept;
    }
}
