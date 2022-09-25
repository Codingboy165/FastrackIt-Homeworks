package Exercitiul13;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal(new Dog());
        Animal cat = new Animal(new Cat());
        Animal cow = new Animal(new Cow());
        dog.eat();
        dog.talk();
        dog.walk();
        cat.eat();
        cat.walk();
        cat.talk();
        cow.walk();
        cow.talk();
        cow.eat();
    }
}