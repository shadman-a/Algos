package dev.shadmanahmed;

import java.util.*;

public class UniqueSubsequenceAMZN {

    public static List<Integer> partitionLabels(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, i);
        }

        List<Integer> ans = new ArrayList<>();
        int prev = -1;
        int max = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            max = Math.max(max, map.get(ch));
            if(max == i){
                ans.add(max - prev);
                prev = max;
            }
        }

        return ans;
    }



    public static void main(String[] args) {
        String str = "ababcbacadefegdehijhklij";


        System.out.println(partitionLabels(str));
    }

}
