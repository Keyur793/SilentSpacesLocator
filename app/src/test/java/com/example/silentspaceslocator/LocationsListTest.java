package com.example.silentspaceslocator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import com.example.silentspaceslocator.Location;
import com.example.silentspaceslocator.LocationsList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LocationsListTest {

  LocationsList locationsList;

  @BeforeEach
  void setup() {
    locationsList = new LocationsList();
    locationsList.populateLocations(); 
  }

  @Test
  void testPopulateLocations() {
    assertEquals(10, locationsList.getSize());
  }

  @Test
  void testAddLocation() {
    Location newLocation = new Location("New Location", 41.1234, -87.5678, "111 1st St", "Chicago", "IL", "USA", "60611");
    int originalSize = locationsList.getSize();
    
    locationsList.addLocation(newLocation);
    
    assertEquals(originalSize + 1, locationsList.getSize());
    assertTrue(locationsList.getAllLocations().contains(newLocation)); 
  }

  @Test
  void testRemoveLocation() {
    Location locationToRemove = locationsList.getAllLocations().get(0);
    int originalSize = locationsList.getSize();
    
    locationsList.removeLocation(locationToRemove);
    
    assertEquals(originalSize - 1, locationsList.getSize());
    assertFalse(locationsList.getAllLocations().contains(locationToRemove));
  }

  // Other test cases...

}