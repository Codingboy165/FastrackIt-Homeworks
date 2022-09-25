package Exercitiul11;

public class FacebookAd implements AdvertisementProvider{
    @Override
    public void deliverMessage(String message) {
        System.out.println(String.format("Posting '%s' to Facebook",message));
    }
}