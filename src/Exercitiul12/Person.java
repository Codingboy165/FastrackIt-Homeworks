package Exercitiul12;

import java.time.LocalDateTime;

public interface Person {
    String getFirstname(String firstName);
    String getLastName(String lastName);

    LocalDateTime getBirthday();
    String getAdress();
}
