package Exercitiul12;

import java.time.LocalDateTime;

public class AgeCalculator {

    private Person person;

    public AgeCalculator(Person person) {
        this.person = person;
    }

    public int getAge(){
        int yearAge = LocalDateTime.now().getYear() - person.getBirthday().getYear();
        int localMonth = LocalDateTime.now().getMonthValue();
        int personMonth = person.getBirthday().getMonthValue();
        if(localMonth < personMonth){
            return yearAge-1;
        }
        if(LocalDateTime.now().getDayOfMonth() < person.getBirthday().getDayOfMonth()){
            return yearAge-1;
        }else if(LocalDateTime.now().getHour() < person.getBirthday().getHour()){
            return yearAge-1;
        }else if(LocalDateTime.now().getMinute()<person.getBirthday().getMinute()){
            return yearAge-1;
        }else if(LocalDateTime.now().getSecond()< person.getBirthday().getSecond()){
            return yearAge - 1;
        }else
        return yearAge;
    }
}
