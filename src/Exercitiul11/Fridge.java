package Exercitiul11;

public class Fridge extends Electronics{
    private double temperature;

    public Fridge(int price, String name, String description, int quantity, String type, int length, int width, int height, int weight, double temperature) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }
}
