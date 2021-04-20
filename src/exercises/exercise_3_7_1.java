package exercises;

import java.util.ArrayList;

public class exercise_3_7_1 {
    public static void main(String [] args) {
        String suess = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> suessArray = new ArrayList<>();
        String split = "";
        for (char c : suess.toCharArray()) {
            if(c != ',' && c != '.'){
                split = split+c;
            }else {
                split = split+'.';
                suessArray.add(split);
                split = "";
            }
        }
        System.out.println("this is the final result of the built array "+suessArray);

//        int nums[] = {1, 1, 2, 3, 5, 8, 13, 21};
//
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] % 2 != 0){
//                System.out.println(nums[i]);
//            }
//        }
    }
}
