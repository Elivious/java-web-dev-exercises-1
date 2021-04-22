package exercises.studio_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;

public class studio_2 {
    public static void main(String[] args) throws IOException {
        Path fileName = Path.of("C:/Users/MarcusAdmin/Desktop/string.txt");
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

        Files.writeString(fileName, userSubmission);
        String actual = Files.readString(fileName);

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
        char[] query = actual.toLowerCase(Locale.ROOT).toCharArray();
        char[] result = search.toLowerCase(Locale.ROOT).toCharArray();
        for(char i : query){
            if(i == result[0]){
                occurence += 1;
            }
        }
        System.out.println("Your chosen letter appears "+occurence+" times in the passage");
    }
}
