package Exercitiul11;

public class Cosmetics extends Product{
    private String color;
    private int weight;

    public Cosmetics(int price, String name, String description, int quantity, String color, int weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
