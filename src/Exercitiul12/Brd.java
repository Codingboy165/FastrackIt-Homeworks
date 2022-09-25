package Exercitiul12;

 public class Brd implements BankBehaviours {

        @Override
        public void withdraw() {
            System.out.println("Welcome to BRD bank. You get you're money");
        }

        @Override
        public void deposit() {
            System.out.println("You deposit you're money to  BRD bank");
        }
    }
