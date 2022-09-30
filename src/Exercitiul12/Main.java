package Exercitiul12;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> flowers = new HashSet<>();
        Bouquet azElsoCsokor = new Bouquet(flowers);
        azElsoCsokor.add("rose");
        azElsoCsokor.add(null);
        azElsoCsokor.add("pipacs");
        azElsoCsokor.add("violet");
        azElsoCsokor.remove("violet");
        System.out.println(azElsoCsokor.getAll());
    }
}