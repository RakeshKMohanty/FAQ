import java.util.*;
import java.util.stream.Collectors;

class Employee{

    int id ;

    String name;
    String dept;
    public Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getDept(){
        return dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", name='" + dept + '\'' +
                '}';
    }

}
public class IQ {
    public static void main(String[] args) {

        List<Employee> employees = List.of(new Employee(1, "Rakesh","physics"),
                new Employee(2, "Ankit","finance"),
                new Employee(3, "Aniket","finance"),
                new Employee(4,"Animesh","supplychain"));

        //sorting an employee based on values

        Map<String,Employee> employeeMap = new HashMap<>();
        employeeMap.put("Finance",new Employee(11,"Ankit1","Finance1"));
        employeeMap.put("Physics",new Employee(22,"Amit1","Physics1"));
        employeeMap.put("Chemistry", new Employee(33,"Akash1","Chemistry1"));
        employeeMap.put("Admin",new Employee(44,"Biresh","Admin1"));

        LinkedHashMap<String, Employee> collect = employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparingInt(Employee::getId)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        employeeMap.entrySet().stream().sorted(Comparator.comparingInt(o -> o.getValue().getId())).forEach(stringEmployeeEntry -> {
            System.out.println("key :"+stringEmployeeEntry.getKey()+", value: "+stringEmployeeEntry.getValue());
        });

        Map<String, List<Employee>> employeeByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
        //Stream<Map.Entry<String, List<Employee>>> sorted = employeeByDept.entrySet().stream().sorted(Map.Entry.comparingByValue((o1, o2) -> o1.stream()))

        Map<String,List<Employee>> sortedEmployee =  employees.stream()
           .collect(Collectors.groupingBy(Employee::getDept,Collectors.filtering(employee -> employee.getName().startsWith("An"),Collectors.toList())));
        sortedEmployee.forEach((department,employee) -> System.out.println("department : "+department+"employee : "+employee));

        employees.stream().map(Employee::getDept);
    }
}
