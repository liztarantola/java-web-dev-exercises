package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
//        for (Flavor flavor: flavors) {
//            System.out.println(flavor);
//        }
        for (Cone cone: cones) {
            System.out.println(cone);
        }

//        flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
//
        cones.sort(new ConeComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        System.out.println("*****AFTER*****");

//        for(Flavor flavor: flavors) {
//            System.out.print(flavor);
//        }
        for ( Cone cone: cones) {
            System.out.println(cone);
        }
    }
}
