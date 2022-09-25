package Exercitiul12;

public class Person {
    private BankBehaviours bankBehaviours;

    public Person(BankBehaviours bankBehaviours) {
        this.bankBehaviours = bankBehaviours;
    }

    public void withdraw(){
        bankBehaviours.withdraw();
    }

    public void deposit(){
        bankBehaviours.deposit();
    }
}
