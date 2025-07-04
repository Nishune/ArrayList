package dev.lpa.dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PlaceMain {

    public static void main(String[] args) {

        LinkedList<Place> itinerary = new LinkedList<>();

        addPlace(itinerary, new Place("Sydney", 0));
        addPlace(itinerary, new Place("Adelaide", 1374));
        addPlace(itinerary, new Place("Alice Springs", 2771));
        addPlace(itinerary, new Place("Brisbane", 917));
        addPlace(itinerary, new Place("Darwin", 3972));
        addPlace(itinerary, new Place("Melbourne", 877));
        addPlace(itinerary, new Place("Perth", 3923));


        runMenu(itinerary);


    }
    private static void addPlace(LinkedList<Place> list, Place newPlace) {
        if(!list.contains(newPlace)) {
            list.add(newPlace);
        } else {
            System.out.println("The " + newPlace.getTown() + " is already in the list!");
        }
    }
    private static void runMenu(LinkedList<Place> itinerary) {
        Scanner scanner = new Scanner(System.in);
        ListIterator<Place> listIterator = itinerary.listIterator();
        boolean quit = false;
        boolean forward = true;

        printMenu();

        while (!quit) {
            String input = scanner.nextLine().trim().toUpperCase();
            switch (input) {
                case "F" -> {
                    if (!forward) {
                        if (listIterator.hasNext()) listIterator.next();
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Going forward to " + listIterator.next().getTown());
                    }
                }
                case "B" -> {
                    if (forward) {
                        if (listIterator.hasPrevious()) listIterator.previous();
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Going back to " + listIterator.previous().getTown());
                    }
                }
                case "L" -> {
                    System.out.println("Listing all places: ");
                    for(Place place : itinerary) {
                        System.out.println(place.getTown() + " (" + place.getDistance() + " km)");
                    }
                }
                case "M" -> printMenu();

                case "Q" -> {
                    System.out.println("Quitting program...");
                    quit = true;
                }
            }
        }


    }

    private static void printMenu() {
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """);

    }
}


