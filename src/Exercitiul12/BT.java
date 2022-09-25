package Exercitiul12;

public class BT implements BankBehaviours {

    @Override
    public void withdraw() {
        System.out.println("Welcome to BT. You withdraw you're money");
    }

    @Override
    public void deposit() {
        System.out.println("You're deposit your money in BT bank");
    }
}
