package Exercitiul12;

public class Ing implements BankBehaviours {

    @Override
    public void withdraw() {
        System.out.println("The person gets his money");
    }

    @Override
    public void deposit() {
        System.out.println("The person send money to the Bank");
    }
}
