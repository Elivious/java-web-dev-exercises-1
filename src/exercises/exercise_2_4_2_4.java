package exercises;

import java.util.Locale;
import java.util.Scanner;

public class exercise_2_4_2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?");
        System.out.println("Please enter what you'd like to search for in the above text");
        String check = input.nextLine();
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        System.out.println("Contains sequence " + check + ": " + alice.toLowerCase(Locale.ROOT).contains(check.toLowerCase(Locale.ROOT)));
    }
}
