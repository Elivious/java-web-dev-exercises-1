package exercises.studio_2;

import java.awt.*;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner userString = new Scanner(System.in);
        String userSubmission;
        Boolean check;
        do {
            System.out.println("Please type in the string you would like to save.");
            userSubmission = userString.nextLine();
            if(userSubmission.matches(".*\\d.*")){
                System.out.println("Please enter only alphabetical letters.");
                check = false;
            }else {
                System.out.println("Sentence passed");
                check = true;
            }
        }while(!check);
    }
}
