package dev.shadmanahmed;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedChar {
    public char firstNonRepeat(String str){
        Map<Character, Integer> map = new HashMap<>();
        var arr = str.toCharArray();
        for (var item: arr) {
            var count = map.containsKey(item) ? map.get(item) : 0;
            map.put(item, count + 1);
        }

        for (var ch: arr){
            if (map.get(ch) == 1)
                return ch;
        }
        return Character.MIN_VALUE;
    }
}
