package iegcode.java.application;

import iegcode.java.data.City;
import iegcode.java.data.Location;

public class LocationApp {
    public static void main(String[] args) {

      //  var location = new Location(); // err
        var city = new City();
        city.name = "Yogyakarta";
        System.out.println(city.name);
    }
}
