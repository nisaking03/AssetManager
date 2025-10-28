package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Asset> assetList = new ArrayList<>();

     //───────────────────────────────────────────────────── ⋆⋅☆⋅⋆ ─────────────────────────────────────────────────────

        House h = new House("Main House", "2007", 22100.00,
                "123 Smith St", 2, 2500, 10000);

        House h1 = new House("DewDrop Valley", "6-19-2025", 11705.00,
                "245 Rainy Ridges Lane", 1, 2200, 8000);

        House h2 = new House("Wintery Woods", "12-21-2024", 21611.00,
                "906 Polar Express Road", 2, 3500, 9400);

        assetList.add(h);
        assetList.add(h1);
        assetList.add(h2);

     //───────────────────────────────────────────────────── ⋆⋅☆⋅⋆ ─────────────────────────────────────────────────────

        Vehicle v = new Vehicle("Nisa's Car", "2025", 1500.00,
                "Toyota Carolla", 2009,87250);

        Vehicle v1 = new Vehicle("Dinosaur Train", "2011", 1350.00,
                "Train with Dinos", 2006, 50000);

        Vehicle v2 = new Vehicle("Santa's Sleigh", "1960", 400,
                "Magic Sleigh", 1960, 1234567890);

        assetList.add(v);
        assetList.add(v1);
        assetList.add(v2);

     //───────────────────────────────────────────────────── ⋆⋅☆⋅⋆ ─────────────────────────────────────────────────────

        for( Asset a : assetList){
            System.out.println("────────────────── ⋆⋅☆⋅⋆ ──────────────────");
            System.out.println("Description: " + a.getDescription());
            System.out.println("Date Acquired: " + a.getDateAcquired());
            System.out.println("Original Cost: " + a.getOriginalCost());
            System.out.println("Current Value: " + a.getValue());
        }
    }
}
