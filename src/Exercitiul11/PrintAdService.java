package Exercitiul11;

public class PrintAdService implements AdvertisementProvider{
    @Override
    public void deliverMessage(String message) {
        System.out.println(String.format("Printing newspaper with this title: '%s'",message));
    }
}
