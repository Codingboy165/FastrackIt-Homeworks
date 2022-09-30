package Exercitiul12;

import java.util.Collection;
import java.util.Set;

public class Bouquet {
    private final Set<String> flowers;

    public Bouquet(Set<String> flowers) {
        this.flowers = flowers;
    }

    public Collection<String> getAll(){
        return flowers;
    }

    public void add(String flower){
        if (!flowers.contains(flower) && flower!=null){
            flowers.add(flower);
        }
    }

    public void remove (String flower){
        if (flower!=null && flower.contains(flower) ){
            flowers.remove(flower);
        }
    }
}
