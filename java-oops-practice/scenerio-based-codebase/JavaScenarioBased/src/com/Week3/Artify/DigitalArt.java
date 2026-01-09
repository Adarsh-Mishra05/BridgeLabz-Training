package com.Week3.Artify;

public class DigitalArt extends Artwork implements IPurchasable {

    public DigitalArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    @Override
    public void purchase(User user) {
        if (user.getWalletBalence() >= price) {
            user.deductBalance(price);
            System.out.println(user.getName() + " purchased art: " + title);
        } else {
            System.out.println("Insufficient wallet balance");
        }
    }

    @Override
    public void license() {
        System.out.println("Digital License Applied: Online usage only");
    }
}
