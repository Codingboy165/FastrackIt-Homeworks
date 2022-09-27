package Exercitiul12;

import java.time.LocalDateTime;

public class DatabaseAdmin extends Employee {
    private String dbTechnology;

    public DatabaseAdmin(LocalDateTime birthDate, String position) {
        super(birthDate, position);
    }


    @Override
    public String getAdress() {
        return "db admin " + super.getAdress();
    }
}
