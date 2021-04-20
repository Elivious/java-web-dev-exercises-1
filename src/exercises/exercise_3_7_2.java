package exercises;

import java.util.ArrayList;

public class exercise_3_7_2 {
    public static void main(String[] args) {
//        ArrayList<Integer> integers = new ArrayList<>();
//        int i = 0;
//        while(i < 10){
//            integers.add(i);
//            i++;
//        }

        ArrayList<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
        for (String j : planets) {
            if(j.length() == 5){
                System.out.println(j);
            }
        }
    }
}
