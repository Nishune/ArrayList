package dev.lpa.dev.lpa;

import java.util.Comparator;
import java.util.LinkedList;

public class Place {
    private String town;
    private int distance;

    public Place(String town, int distance) {
        this.town = town;
        this.distance = distance;
    }

    public String getTown() {
        return town;
    }

    public int getDistance() {
        return distance;
    }

    public static void sortDistance(LinkedList<Place> list) {
        list.sort(Comparator.comparingInt(Place::getDistance));
    }
}
