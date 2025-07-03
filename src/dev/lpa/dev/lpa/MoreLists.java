package dev.lpa.dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {

        String[] items = {"Apples", "Bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yoghurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("Pickles", "Mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList); //Takes a list and adds it to another.
        System.out.println(groceries);

        System.out.println("Third item = " + groceries.get(2)); //takes out an item from array list.

        if (groceries.contains("Mustard")) { //Searches for an item in a list
            System.out.println("List contains mustard");
        }

        groceries.add("Yoghurt");
        System.out.println(groceries);
        System.out.println("First = " + groceries.indexOf("Yoghurt"));
        System.out.println("Last = " + groceries.lastIndexOf("Yoghurt"));

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("Yoghurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("Apples", "eggs")); //removing all apples and eggs from list.
        System.out.println(groceries);

        groceries.retainAll(List.of("apples", "milk", "Mustard", "cheese"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));


    }
}
