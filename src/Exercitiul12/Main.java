package Exercitiul12;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AgeCalculator ageCalculator = new AgeCalculator(new Employee(LocalDateTime.of(2022,12,11,10,15,11),"Kfc Employee"));
        System.out.println(ageCalculator.getAge());
    }
}
