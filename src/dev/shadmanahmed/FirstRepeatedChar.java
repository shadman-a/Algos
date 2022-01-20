package dev.shadmanahmed;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedChar {
    public char firstRepeat(String str){
        Set<Character> set= new HashSet<>();
        char [] arr = str.toCharArray();
        for (char ch: arr) {
           if (set.contains(ch))
               return ch;

           set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
