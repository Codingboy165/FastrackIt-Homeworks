package Exercitiul12;

import java.time.LocalDateTime;

public class Employee implements Person {
    private LocalDateTime birthDate;
    private String position;

    public Employee(LocalDateTime birthDate, String position) {
        this.birthDate = birthDate;
        this.position = position;
    }


    @Override
    public String getFirstname(String firstName) {
        return firstName;
    }

    @Override
    public String getLastName(String lastName) {
        return lastName;
    }

    @Override
    public LocalDateTime getBirthday() {
        return birthDate;
    }

    @Override
    public String getAdress() {
        return null;
    }
}
