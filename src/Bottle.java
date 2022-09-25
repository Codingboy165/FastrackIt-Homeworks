import java.util.Random;

public class Bottle {

    public int totalCapacity;
    public int availableLiquid;
    public boolean open;

    public boolean capacityIsGreaterThan0=true;

    public Bottle(int totalCapacity, int availableLiquid, boolean open) {
        System.out.println("A bottle is preparing:");
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public boolean theBottleHasLiquid() {
        return availableLiquid>0;
    }

    public int availableLiquidMethod() {
        return availableLiquid;
    }

    public int emptyCapacityReturn() {
        return totalCapacity - availableLiquid;
    }

    public String openTheBottle() {
        if (!open) {
            open = true;
            return ("curs6Homework.Bottle is opened now");
        } else return ("The bottle is already opened");
    }

    public String closeTheBottle() {
        if (open) {
            return ("The bottle is closed now");
        } else return ("The bottle is already closed");
    }

    public void drinkALittleWater() {
        Random random = new Random();
        if (availableLiquid > 0) {
            int theWaterYouDrink = random.nextInt(availableLiquid);
            int remainingWaterInTheBottle = availableLiquid - theWaterYouDrink;
            System.out.println("The amount of water you drank is: " + theWaterYouDrink + " ml.");
            System.out.println("You have " + remainingWaterInTheBottle + " ml water in the bottle.");
        }
    }
}

