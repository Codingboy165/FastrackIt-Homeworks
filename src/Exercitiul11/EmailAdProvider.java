package Exercitiul11;

public class EmailAdProvider implements AdvertisementProvider{
    @Override
    public void deliverMessage(String message) {
        System.out.println(String.format("Sending email with message: '%s'",message));
    }
}
