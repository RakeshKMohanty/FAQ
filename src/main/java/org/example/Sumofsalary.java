package org.example;

import java.util.*;
import java.util.stream.Collectors;


public class Sumofsalary {

    public static void main(String[] args) {

        List<Employee> employees = List.of(new Employee(1, "Rajesh", 5000, "Physics"),
                new Employee(2, "Ramesh", 6000, "Physics"),
                new Employee(3, "Ramesh", 7000, "Chemistry"),
                new Employee(4, "Akash", 5000, "Math"),
                new Employee(5, "Anash", 5000, "Math"));

        System.out.println("Printing employee in sorted order");

         employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList()).forEach(System.out::println);

        // System.out.println(employees.);
        employees.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.summingLong(Employee::getSalary))).forEach((key, value) -> System.out.println("Salary :" + key + ",Total Salary of Employees : " + value));
        //System.out.println(employees.stream().collect(Collectors.summingLong(Employee::getSalary)));

        //Find the total salary of an employees
        long totalSalary = employees.stream().mapToLong(Employee::getSalary).sum();
        System.out.printf("%d is total salary of an employees\n", totalSalary);



        //Find the employess by department
       // Map<String, List<Employee>> employeeByDept =
        Map<String, List<Employee>> employeeByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
        //Map<String, List<Employee>> employeeByDept1 =
         employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.collectingAndThen(Collectors.toList(), employees1 -> employees1.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()))))
                 .forEach((key,value)-> System.out.println(key +" : "+value));

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.mapping(Employee::getName,Collectors.collectingAndThen(Collectors.toList(),nameList-> nameList.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList())))))
                .forEach((key,value)-> System.out.println(key +" : "+value));

        LinkedHashMap<String, List<String>> collect = employees.stream()
                .collect(Collectors.groupingBy
                        (Employee::getDept,
                                Collectors.mapping(Employee::getName, Collectors.toList()))).entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> newValue, LinkedHashMap::new));

        /*LinkedHashMap<String, List<String>> collect =
                employeeByDept.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> newValue, LinkedHashMap::new));*/
        //System.out.println(employeeByDept1);
        //System.out.println(collect);
    }
}
