package com.example.silentspaceslocator;//LocationsList.java
//Author: Joshua Thomas

import com.example.silentspaceslocator.Location;

import java.util.ArrayList;
import java.util.List;

public class LocationsList {
    private List<Location> locations;
    private int SIZE;

    public LocationsList() {
        locations = new ArrayList<>();
        SIZE = 0;
    }

    public void populateLocations() {
        //random chicago locations populate

        locations.add(new Location("Starbucks", 41.8781, -87.6298, "123 Main St", "Chicago", "IL", "USA", "60601"));
        locations.add(new Location("UIC Library", 41.8902, -87.6374, "456 Elm St", "Chicago", "IL", "USA", "60602"));
        locations.add(new Location("UIC REC", 41.9006, -87.6244, "789 Oak St", "Chicago", "IL", "USA", "60603"));
        locations.add(new Location("UIC SCE", 41.8925, -87.6262, "101 Pine St", "Chicago", "IL", "USA", "60604"));
        locations.add(new Location("Dunkin Donuts", 41.8776, -87.6200, "222 Maple St", "Chicago", "IL", "USA", "60605"));
        locations.add(new Location("UIC TBH", 41.8827, -87.6233, "333 Birch St", "Chicago", "IL", "USA", "60606"));
        locations.add(new Location("UIC ARC", 41.8789, -87.6359, "444 Spruce St", "Chicago", "IL", "USA", "60607"));
        locations.add(new Location("Fontano's Subs", 41.8872, -87.6420, "555 Cedar St", "Chicago", "IL", "USA", "60608"));
        locations.add(new Location("Busy Burger", 41.8938, -87.6213, "666 Willow St", "Chicago", "IL", "USA", "60609"));
        locations.add(new Location("Potbelly", 41.8971, -87.6314, "777 Oak St", "Chicago", "IL", "USA", "60610"));

        SIZE = locations.size();
    }

    public void addLocation(Location location) {
        locations.add(location);
        SIZE = locations.size();
    }

    public void removeLocation(Location location) {
        locations.remove(location);
        SIZE = locations.size();
    }

    public List<Location> getAllLocations() {
        return locations;
    }

    public int getSize() {
        return locations.size();
    }

    public void printLocations() {
        for (Location location : locations) {
            System.out.println(location);
        }
    }
}
