package Exercitiul12;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AgeCalculator ageCalculator = new AgeCalculator(new DatabaseAdmin(LocalDateTime.of(1235,10,10,10,10,10)));
        System.out.println(ageCalculator.getAge());
    }
}
