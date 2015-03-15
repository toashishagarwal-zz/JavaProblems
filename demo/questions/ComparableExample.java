package demo.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person>{
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
    public Person(String firstName, String lastName, int age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName
                + ", age=" + age + "]";
    }
    @Override
    public int compareTo(Person another) {
       int firstNameCompareValue = firstName.compareTo(another.firstName);
       return ((firstNameCompareValue == 0) ? lastName.compareTo(another.lastName) : firstNameCompareValue);
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Abha", "Grewal", 23));
        persons.add(new Person("Ashish", "Agarwal", 21));
        persons.add(new Person("Rahim", "Shaikh",44));
        persons.add(new Person("Ashish", "Agarwal", 4));
        
        System.out.println(">> Before sort");
        for (Person p : persons) {
            System.out.println(p);
        }
        
        Collections.sort(persons);
        System.out.println(">> After sort");
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
