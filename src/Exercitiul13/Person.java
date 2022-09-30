package Exercitiul13;

public class Person {
    private String name;
    private int age;
    private String position;

    public Person(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public boolean isManager(){
        return position.equals("Manager");
    }
}
