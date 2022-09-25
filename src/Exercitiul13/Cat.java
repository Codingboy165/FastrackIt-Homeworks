package Exercitiul13;

public class Cat implements AnimalBehaviours{
    @Override
    public String walk() {
        return "The cat walks";
    }

    @Override
    public String talk() {
        return "Meoww";
    }

    @Override
    public String eat() {
        return "Nyam nyam ";
    }
}
