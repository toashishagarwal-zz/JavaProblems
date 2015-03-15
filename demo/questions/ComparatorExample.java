package demo.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    private String firstName;
    private String lastName;
    private int age;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Employee(String firstName, String lastName, int age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName
                + ", age=" + age + "]";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Ashish", "Grewal", 23));
        employees.add(new Employee("Ashish", "Agarwal", 21));
        employees.add(new Employee("Rahim", "Shaikh",44));
        employees.add(new Employee("Ashish", "Agarwal", 4));
        
        System.out.println(">> Before sort");
        for (Employee p : employees) {
            System.out.println(p);
        }
        
        Collections.sort(employees , new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int i = o1.getFirstName().compareTo(o2.getFirstName());
                int j = o1.getLastName().compareTo(o2.getLastName());
                int k = o1.getAge() - o2.getAge();
                if(i < 0) {
                    return -1;
                } else if ( i > 0) {
                    return 1;
                } else {
                    if( j < 0) {
                        return -1;
                    } else if ( j > 0) {
                        return 1;
                    }  else {
                        if( k < 0) {
                            return -1;
                        } else if ( k > 0) {
                            return 1;
                        }  else {
                            return 0;
                        }
                    }
                }
            }
        });
        System.out.println(">> After sort");
        for (Employee p : employees) {
            System.out.println(p);
        }
    }
}
