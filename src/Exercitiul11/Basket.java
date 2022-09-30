package Exercitiul11;

import java.util.*;

public class Basket {
    private List<String> fruits;

    public Basket(List<String> fruits) {
        this.fruits = fruits;
    }

    public boolean find(String fruit) {
        if (fruit == null) {
            return false;
        } else return fruits.contains(fruit);

    }

    public boolean remove(String removedFruit) {
        if (removedFruit == null) {
            return false;
        } else if (fruits.contains(removedFruit)) {
            fruits.remove(removedFruit);
            return true;
        } else return false;
    }

    public int position(String fruit) {
        if (fruit == null) {
            return -1;
        } else if (fruits.contains(fruit)) {
            return fruits.indexOf(fruit)+1;
        } else return -1;
    }

    public Collection<String> distinct() {

        return new TreeSet<>(fruits);

    }

    public void add(String fruit) {
        if (fruit != null) {
            fruits.add(fruit);
        }
    }

    public int customCount() {
        int db = 0;
        for (int i = 0; i < fruits.size(); i++) {
            db++;
        }
        return db;
    }

    public int count() {
        return fruits.size();
    }

}

