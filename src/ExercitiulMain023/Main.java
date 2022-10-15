package ExercitiulMain023;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        List<Employee> employeeList = new ArrayList<>();

        Person person = new Person("Maria", 25, "Black");
        Person person2 = new Person("John", 65, "Red");
        Person person3 = new Person("Ana", 45, "White");
        Person person4 = new Person("Alex", 32, "Red");
        Person person5 = new Person("George", 28, "Black");
        Person person6 = new Person("Cristian", 28, "Orange");
        Person person7 = new Person("Cristina", 28, "Red");
        Person person8 = new Person("Rusu", 95, "Black");
        Employee employee1 = new Employee("Maria", 50, "Blue", "CFR", 6540);
        Employee employee2 = new Employee("Petru", 40, "Red", "McDonald", 2000);
        Employee employee3 = new Employee("Maxim", 34, "Red", "McDonald", 9000);
        Employee employee4 = new Employee("Marian", 50, "Blue", "FastrackIt", 6540);
        Employee employee5 = new Employee("Emilian", 40, "Red", "Burgerking", 2045);
        Employee employee6 = new Employee("Maxima", 34, "Red", "NetflixBoss", 9001);

        employeeList = List.of(employee1, employee2, employee3, employee4, employee5, employee6);
        personList = List.of(person, person2, person3, person4, person5, person6, person7, person8);

        //Method #1
        System.out.println(extractTheNames(personList));

        //Method #2
        Map<String, Integer> theMap = new TreeMap<>();
        theMap = makeAMap(personList);
        System.out.println(theMap);

        //Method #3
        System.out.println(olderOrNotMethod(personList, 5));

        //Method #4
        Map<String, List<String>> theMap2 = new TreeMap<>();
        theMap2 = makeMapForHaircolorAndName(personList);
        System.out.println(theMap2);

        //Method #5
        Map<Integer, List<String>> theMap3 = new HashMap<>();
        theMap3 = mapFromAgeToListOfPersons(personList);
        System.out.println(theMap3);

        //Method #6
        System.out.println(salariesMoreThanASpecified(employeeList, 2000));

        //Method #7
        System.out.println(personForTheSameCompany(employeeList));

        //Method #8
        System.out.println(sumOfAllSalariesForAllEmployees(employeeList));

        //Method #9
        System.out.println(whichCompanyGivesTheBiggestSalary(employeeList));
    }

    public static String whichCompanyGivesTheBiggestSalary(List<Employee> employees) {
        String result = null;
        int max = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                result = employee.getCompany();
            }
        }
        return result;
    }

    public static int sumOfAllSalariesForAllEmployees(List<Employee> employees) {
        int result = 0;
        for (Employee employee : employees) {
            result += employee.getSalary();
        }
        return result;
    }

    public static Map<String, List<Employee>> personForTheSameCompany(List<Employee> employees) {
        Map<String, List<Employee>> result = new TreeMap<>();
        for (Employee employee : employees) {
            result.putIfAbsent(employee.getCompany(), new ArrayList<>());
            result.get(employee.getCompany()).add(employee);
        }
        return result;
    }

    public static List<Employee> salariesMoreThanASpecified(List<Employee> employees, int ammount) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() > ammount) {
                result.add(employee);
            }
        }
        return result;
    }

    public static Map<Integer, List<String>> mapFromAgeToListOfPersons(List<Person> persons) {
        Map<Integer, List<String>> result = new TreeMap<>();
        for (Person person : persons) {
            result.putIfAbsent(person.age(), new ArrayList<>());
            result.get(person.age()).add(person.name());
        }
        return result;
    }

    public static Map<String, List<String>> makeMapForHaircolorAndName(List<Person> persons) {
        Map<String, List<String>> result = new HashMap<>();
        for (Person person : persons) {
            result.putIfAbsent(person.hairColor(), new ArrayList<>());
            result.get(person.hairColor()).add(person.name());
        }
        return result;
    }

    public static List<Person> olderOrNotMethod(List<Person> persons, int age) {
        List<Person> result = new ArrayList<>();
        for (Person p : persons) {
            if (p.age() > age) {
                result.add(p);
            }
        }
        return result;
    }

    public static Map<String, Integer> makeAMap(List<Person> persons) {
        Map<String, Integer> result = new TreeMap<>();
        for (Person p : persons) {
            result.put(p.name(), p.age());
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

