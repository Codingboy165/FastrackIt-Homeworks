package ExercitiulMain023;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final String hairColor;

    public Person(String name, int age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public String hairColor() {
        return hairColor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Person) obj;
        return Objects.equals(this.name, that.name) &&
                this.age == that.age &&
                Objects.equals(this.hairColor, that.hairColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hairColor);
    }

    @Override
    public String toString() {
        return "Person[" +
                "name=" + name + ", " +
                "age=" + age + ", " +
                "hairColor=" + hairColor + ']';
    }

}
