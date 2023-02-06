package com.seroja.factories;

import com.seroja.broadcast.Advertisement;

import java.util.Scanner;

public class AdvertisementCreation {
    Scanner scanner = new Scanner(System.in);

    public Advertisement createAdvertisement(int adDuration, String productName, int priceForMinute) {
        return new Advertisement(adDuration, productName, priceForMinute);
    }

}
