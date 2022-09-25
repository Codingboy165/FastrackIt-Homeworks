import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Person person = new Person("Maria", random.nextInt(100), random.nextBoolean());
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.isMarried());
        System.out.println();

        Person person2 = new Person("Andrei", random.nextInt(100), random.nextBoolean());
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.isMarried());
        System.out.println();

        Person person3 = new Person("Alex", random.nextInt(100), random.nextBoolean());
        System.out.println(person3.getName());
        System.out.println(person3.getAge());
        System.out.println(person3.isMarried());
        System.out.println();

        Product product = new Product("Banana", "a", random.nextInt(10000), random.nextDouble(50));
        System.out.println(product.getName());
        System.out.println(product.getPrice()+" lei");
        System.out.println(product.getQuantity());
        System.out.println(product.getCategory());
        if (product.hasStock()) {
            System.out.println("We have some " + product.getTheName());
        } else System.out.println("Sorry we don't have " + product.getTheName());
        System.out.println();
        if (product.isCategory("b")) {
            System.out.println("Yeah the category is correct");
        } else System.out.println("No the category is incorrect");
        System.out.println();

        Product product2 = new Product("Strawberry", "b", random.nextInt(10000), random.nextDouble(20));
        System.out.println(product2.getName());
        System.out.println(product2.getPrice() + " lei");
        System.out.println(product2.getQuantity());
        System.out.println(product2.getCategory());
        if (product2.hasStock()) {
            System.out.println("We have some " + product2.getTheName());
        } else System.out.println("Sorry we don't have " + product2.getTheName());
        if (product2.isCategory("c")) {
            System.out.println("Yeah the category is correct");
        } else System.out.println("No the category is incorrect");
        System.out.println();

        Product product3 = new Product("Cheese", "c", random.nextInt(10000), random.nextDouble(50));
        System.out.println(product3.getName());
        System.out.println(product3.getPrice()+ " lei");
        System.out.println(product3.getQuantity());
        System.out.println(product3.getCategory());
        if (product3.hasStock()) {
            System.out.println("We have some " + product3.getTheName());
        } else System.out.println("Sorry we don't have " + product3.getTheName());

        if (product3.isCategory("c")) {
            System.out.println("Yeah the category is correct");
        } else System.out.println("No the category is incorrect");

        System.out.println();

        Bottle bottle = new Bottle(random.nextInt(5000), random.nextInt(5000), random.nextBoolean());
        System.out.println("The bottle has " + bottle.totalCapacity + " ml capacity ");
        if (bottle.totalCapacity > bottle.availableLiquid) {
            System.out.println(bottle.theBottleHasLiquid());
            System.out.println(bottle.availableLiquidMethod());
            System.out.println(bottle.emptyCapacityReturn());
            System.out.println(bottle.openTheBottle());
            System.out.println(bottle.closeTheBottle());
            bottle.drinkALittleWater();
        } else System.out.println("The bottle description is wrong because the available liquid (" +
                bottle.availableLiquid + ") is greater than totalCapacity(" + bottle.totalCapacity + ").");
        System.out.println();

        Bottle bottle2 = new Bottle(random.nextInt(5000), random.nextInt(5000), random.nextBoolean());
        System.out.println("The bottle has " + bottle2.totalCapacity + " ml capacity. ");
        if (bottle2.totalCapacity > bottle2.availableLiquid) {
            System.out.println(bottle2.theBottleHasLiquid());
            System.out.println(bottle2.availableLiquidMethod());
            System.out.println(bottle2.emptyCapacityReturn());
            System.out.println(bottle2.openTheBottle());
            System.out.println(bottle2.closeTheBottle());
            bottle2.drinkALittleWater();
        } else System.out.println("The bottle description is wrong because the available liquid (" +
                bottle2.availableLiquid + ") is greater than totalCapacity(" + bottle2.totalCapacity + ").");
        System.out.println();

        Bottle bottle3 = new Bottle(random.nextInt(5000), random.nextInt(5000), random.nextBoolean());
        System.out.println("The bottle has " + bottle3.totalCapacity + " ml capacity ");
        if (bottle3.totalCapacity > bottle3.availableLiquid) {
            System.out.println(bottle3.theBottleHasLiquid());
            System.out.println(bottle3.availableLiquidMethod());
            System.out.println(bottle3.emptyCapacityReturn());
            System.out.println(bottle3.openTheBottle());
            System.out.println(bottle3.closeTheBottle());
            bottle3.drinkALittleWater();
        } else System.out.println("The bottle description is wrong because the available liquid (" +
                bottle3.availableLiquid + ") is greater than totalCapacity(" + bottle3.totalCapacity + ").");
        System.out.println();
    }
}












