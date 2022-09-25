package Exercitiul11;

public class Main {
    public static void main(String[] args) {
        Company JohnnyFm = new Company(new EmailAdProvider());
        JohnnyFm.releaseNewFeatures();
    }
}
