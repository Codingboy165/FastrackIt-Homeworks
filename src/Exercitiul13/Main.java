package Exercitiul13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> employees = new ArrayList<>();
        Company Johnnyfm = new Company(employees);
        Person person = new Person("Johnny",60,"Employee");
        Person person2 = new Person("Alex",20,"Employee");
        Person person3 = new Person("Paul",34,"Employee");
        Person person4 = new Person("Matei",68,"Employee");
        Johnnyfm.add(person);
        Johnnyfm.add(person2);
        Johnnyfm.add(person3);
        Johnnyfm.add(person4);
        System.out.println(employees);
        System.out.println(Johnnyfm.managerGetter());
    }
}
