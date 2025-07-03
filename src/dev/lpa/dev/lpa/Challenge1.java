package dev.lpa.dev.lpa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {


        ArrayList<String> groceryList = new ArrayList<>(List.of("banana", "chocolate", "meat"));
        entryPoint(groceryList);


    }

    private static void entryPoint(ArrayList<String> groceryList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Available actions:\n" +
                "0 - to shutdown\n" +
                "1 - to add item(s) to list (comma delimited list)\n" +
                "2 - To remove any items (comma delimited list\n" +
                "Enter a number for which action you want to do: ");

        int action = sc.nextInt();
        sc.nextLine();
        switch (action) {
            case 0 -> sc.close();
            case 1 -> {
                addItems(groceryList);
            }
            case 2 -> {
                removeItems(groceryList);
            }
            default -> {
                sc.close();
            }
        }
    }

    private static void addItems(ArrayList<String> groceryList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter items separated by comma that you want added: ");
        String[] items = sc.nextLine().split(",");

        for (String item : items) {
            if (groceryList.contains(item)) {
                System.out.println("Item " + item + " already exists!");
                entryPoint(groceryList);
            }
        }

        for (String item : items) {
            item = item.trim();
            groceryList.add(item);
        }
        Collections.sort(groceryList);
        System.out.println("-".repeat(20));
        System.out.println("Your new list after adding items: " + groceryList);
        entryPoint(groceryList);
    }

    private static void removeItems(ArrayList<String> groceryList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter items separated by comma that you want removed: ");
        String[] items = sc.nextLine().split(",");
        for (String item : items) {
            if (!groceryList.contains(item)) {
                System.out.println("Item " + item + " does not exists!");
                System.out.println();
            } else {
                item = item.trim();
                groceryList.remove(item);
            }
        }
        Collections.sort(groceryList);
        System.out.println("-".repeat(20));
        System.out.println("Your new list after removal: " + groceryList);
        entryPoint(groceryList);
    }

}



