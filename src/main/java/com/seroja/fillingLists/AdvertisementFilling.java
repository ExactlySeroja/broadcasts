package com.seroja.service;

import com.seroja.broadcast.Advertisement;
import com.seroja.builders.BroadcastBuilder;
import com.seroja.factories.AdvertisementCreation;

import java.util.ArrayList;
import java.util.Scanner;

public class Filling {
    Scanner scanner = new Scanner(System.in);
    BroadcastBuilder builder = new BroadcastBuilder();
    ArrayList<Advertisement> adList = new ArrayList<>();
    public ArrayList<Advertisement> ADListFilling(int duration , int income){
        System.out.println("Enter number of AD's");
        int adAmount = scanner.nextInt();
        scanner.nextLine();

        while (adAmount != 0) {
            System.out.println("Enter AD duration");
            int adDuration = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter product name");
            String productName = scanner.next();
            scanner.nextLine();
            System.out.println("Enter price for minute");
            int priceForMinute = scanner.nextInt();
            scanner.nextLine();
            AdvertisementCreation advertisementFactory;
            Advertisement advertisement = advertisementFactory.createAdvertisement(adDuration, productName,priceForMinute);
            builder.addAdvertisements(addAdvertisement(advertisement));
            duration -= advertisement.getAdDuration();
            income = income + (advertisement.getPriceForMinute() * advertisement.getAdDuration());
            if ((checkDuration(duration)) || (duration / 2 < advertisement.getAdDuration())) {
                return builder.getResult();
            }
            adAmount--;
        }
    }

    public ArrayList<Advertisement> addAdvertisement(Advertisement ad) {
        adList.add(ad);
        return adList;
    }
}
