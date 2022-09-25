package Exercitiul11;

public class Company {
    private AdvertisementProvider advertisementProvider;

    public Company(AdvertisementProvider advertisementProvider) {

        this.advertisementProvider = advertisementProvider;
    }

    public void releaseNewFeatures() {

        advertisementProvider.deliverMessage("Hehehe armageddon is here!!!");
    }
}
