package exercises.studio_2;

import java.util.Locale;
import java.util.Scanner;

public class studio_2 {
    public static void main(String[] args) {
        Scanner userString = new Scanner(System.in);
        System.out.println("Please type in the string you would like to save.");
        String userSubmission = userString.nextLine();
       // String sample = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String search;
        Integer occurence = 0;
        do{
            System.out.println("What letter would you like to search for?");
            Scanner input = new Scanner(System.in);
            search = input.nextLine();
            if(search.length() != 1){
                System.out.println("Please enter only one letter");
            }
        }while (search.length() != 1);
        char[] query = userSubmission.toLowerCase(Locale.ROOT).toCharArray();
        char[] result = search.toLowerCase(Locale.ROOT).toCharArray();
        for(char i : query){
            if(i == result[0]){
                occurence += 1;
            }
        }
        System.out.println("Your chosen letter appears "+occurence+" times in the passage");
    }
}
