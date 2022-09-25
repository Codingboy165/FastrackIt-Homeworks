package Exercitiul13;

public class Cow implements AnimalBehaviours{

    @Override
    public String walk() {
        return "The cow walks on the farm";
    }

    @Override
    public String talk() {
        return "Muuuuh";
    }

    @Override
    public String eat() {
        return "NYAMIIIIII";
    }
}
