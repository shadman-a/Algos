package dev.shadmanahmed;

import java.util.Stack;

public class StringReverser {
    public Stack reverse(String str){
        if (str == null) {
            throw new IllegalArgumentException();
        }

        var arr = str.toCharArray();
        var reverse = new Stack<>();
        for (int i = str.length() -1; i >= 0; i--) {
            reverse.push(arr[i]);
        }

        return reverse;
    }
}
