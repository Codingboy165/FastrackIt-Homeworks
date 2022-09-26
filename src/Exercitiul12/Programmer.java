package Exercitiul12;

import java.time.LocalDateTime;

public class Programmer extends Employee{
    String language;

    public Programmer(LocalDateTime birthDate, String position, String language) {
        super(birthDate, position);
        this.language = language;
    }

    public String getPosition(){
        return "programmer";
    }
}
