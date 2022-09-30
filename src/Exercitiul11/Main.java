package Exercitiul11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("strawberry");
        fruit.add("orange");
        fruit.add("orange");
        fruit.add("orange");
        Basket basket1 = new Basket(fruit);
        System.out.println(basket1.count());
        System.out.println(basket1.customCount());
        System.out.println("The strawberry is in the position: " + basket1.position("strawberry"));
        basket1.remove("strawberry");
        basket1.remove("apple");
        basket1.add("LemOn");
        basket1.add("LEmon");
        basket1.add("lemon");
        basket1.add("Lemon");
        basket1.add("Banana");
        basket1.add("Banana");
        System.out.println(fruit);
        System.out.println(basket1.find("orange"));
        System.out.println(basket1.distinct());
    }
}
