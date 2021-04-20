package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        int length;
        int width;
        int area;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        length = input.nextInt();

        Scanner moreInput = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle:");
        width = moreInput.nextInt();
        input.close();


        area = length * width;
        System.out.println("The area of the rectangle is: " + area);

    }
}
