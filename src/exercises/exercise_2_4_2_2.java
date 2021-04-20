package exercises;

import java.util.Scanner;

public class exercise_2_4_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the long side of the rectangle?");
        int longSide = input.nextInt();
        System.out.println("Great, now what is the length of the short side?");
        int shortSide = input.nextInt();
        System.out.println("with the data you've provided, the area of the rectangle is " + longSide*shortSide);
    }
}
