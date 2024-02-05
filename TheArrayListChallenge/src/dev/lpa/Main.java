package dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
   private static Scanner scanner = new Scanner(System.in);
   private static Scanner  scanner1 = new Scanner(System.in);
    public static void main(String[] args) {

       boolean semafor = true;
       ArrayList<String> groceryList = new ArrayList();
        System.out.println(groceryList);
        while (semafor){
            System.out.printf("""
                Available actions:

                0 - to shutdown
                1 - to add item(s) to list
                2 - to remove any items

                Enter a number for which action you want to do:
                """);
            int action = scanner.nextInt();
            if (action == 0){
                semafor = false;
                break;
            }
            if (action == 1){
                addItems(groceryList);

            }
            if (action == 2){
                removeItem(groceryList);
            }
            groceryList.sort(Comparator.naturalOrder());
            System.out.println(groceryList);
        }
    }
    public static void addItems (ArrayList<String> groceries){
        System.out.println("Add items");
        String[] items = scanner1.nextLine().split(",");
        for (String i : items){
            String trim = i.trim();
            groceries.add(trim);


        }
//        groceries.addAll(List.of(items));
    }
    public static void removeItem(ArrayList<String> groceries){
        System.out.println("Remove item");
        String[] item = scanner1.nextLine().split(",");

        for (String i: item){
            String trim = i.trim();
            groceries.remove(trim);
        }
    }

}
