package ExercitiulMain02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person = new Person("Maria", 25, "Black");
        Person person2 = new Person("John", 65, "Red");
        Person person3 = new Person("Ana", 45, "White");
        Person person4 = new Person("Alex", 32, "Red");
        Person person5 = new Person("George", 67, "Black");
        Person person6 = new Person("Cristian", 86, "Orange");
        Person person7 = new Person("Cristina", 28, "Red");
        Person person8 = new Person("Rusu", 95, "Black");
        personList = List.of(person, person2, person3, person4, person5, person6, person7, person8);
        System.out.println(extractTheNames(personList));
        Map<String,Integer> theMap= new TreeMap<>();
        theMap=makeAMap(personList);
        System.out.println(theMap);
        System.out.println(olderOrNotMethod(personList,5));

    }

    public static List<Person> olderOrNotMethod(List<Person> persons, int age){
        List<Person> result = new ArrayList<>();
        for (Person p:persons){
            if(p.age()>age){
                result.add(p);
            }
        }
        return result;
    }
    public static Map<String,Integer> makeAMap (List<Person> persons){
        Map<String,Integer> result=new TreeMap<>();
        for (Person p:persons){
            result.put(p.name(),p.age());
        }
        return result;
    }
    public static List<String> extractTheNames(List<Person> persons) {

        int i = 0;
        List<String> result = new ArrayList<>();

        for (Person p : persons) {
            result.add(p.name());
        }
        return result;
    }

    public static List<Integer> extractTheAge(List<Person> persons) {

        int i = 0;
        List<Integer> result = new ArrayList<>();

        for (Person p : persons) {
            result.add(p.age());
        }
        return result;
    }



}

