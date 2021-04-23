package exercises.datatypes;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        float miles;
        float gasUsed;
        float milesPerGallon;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles driven:");
        miles = input.nextFloat();

        Scanner moreInput = new Scanner(System.in);
        System.out.println("Enter gallons of gas used:");
        gasUsed = moreInput.nextFloat();
        input.close();

        milesPerGallon = miles/gasUsed;
        System.out.println("Your care gets: " + milesPerGallon + "per gallon");
    }
}
