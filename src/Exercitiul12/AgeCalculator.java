package Exercitiul12;

import java.time.LocalDateTime;

public class AgeCalculator {

    private Person person;

    public AgeCalculator(Person person) {
        this.person = person;
    }

    public int getAge(){
        return LocalDateTime.now().getYear()-person.getBirthday().getYear();
    }
}
