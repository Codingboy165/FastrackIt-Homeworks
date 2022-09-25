package Exercitiul13;

public class Dog implements AnimalBehaviours {

    @Override
    public String walk() {
        return "the dog walking on the street";
    }

    @Override
    public String talk() {
        return "wouf wouf";
    }

    @Override
    public String eat() {
        return "nyiam nyiam";
    }
}
