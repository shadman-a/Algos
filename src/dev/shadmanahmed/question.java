//package dev.shadmanahmed;
//
//import java.util.ArrayList;
//import java.util.Objects;
//
//// word is defined as a series of alpha numeric characters excluding space.
//// Given a string consisting of multiple words and given two words in the string, write a function that will return the minimum distance between the two words.  Adjacent words will have a distance of 1.
////Examples:
////Given: “a simple sentence for testing code”, “simple”, “code”
////Expected output: 4
////Given: “today will be rainy and today will be cloudy”, “today”, “cloudy”
////Expected output: 3
////Given: “cat bird fish dog cat bird dog”, “cat”, “dog”
////Expected output: 1
//public class question {
//    public static void main(String[] args) {
//        String str = "cat bird fish dog cat bird dog";
//        String wrd1 =  "cat";
//        String wrd2 =  "dog";
//
//        ArrayList<Integer> answers = new ArrayList<Integer>();
//
//        String[] arr = str.split(" ");
//        int loc1 = 0;
//        int loc2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (Objects.equals(arr[i], wrd1)){
//                loc1 = i;
//            }
//            if (Objects.equals(arr[i], wrd2)){
//                loc2 = i;
//            }
//            int ans = loc2 -loc1;
//            answers.add(ans);
//
//
//        }
//
//
//        }


//
//
//    }
//}
