package Exercitiul13;

public class Animal {

    private AnimalBehaviours animalBehaviours;

    public Animal(AnimalBehaviours animalBehaviours) {
        this.animalBehaviours = animalBehaviours;
    }

    public void walk(){
        System.out.println(animalBehaviours.walk());
    }

    public void talk(){
        System.out.println(animalBehaviours.talk());
    }

    public void eat(){
        System.out.println(animalBehaviours.eat());
    }

}
