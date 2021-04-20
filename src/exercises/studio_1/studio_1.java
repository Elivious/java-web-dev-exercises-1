package exercises.studio_1;

import java.util.Scanner;

public class studio_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double pi = 3.14;
        System.out.println("What is the radius of your circle?");
        int r = input.nextInt();
        if (r < 0){
            System.out.println("error, invalid entry.");
        }else {
            Double circle = pi*r*r;
            System.out.println("with the data you've provided, the area of the circlr is " + circle);
        }
    }
}
