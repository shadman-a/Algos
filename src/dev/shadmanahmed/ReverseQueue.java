package dev.shadmanahmed;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static Queue<Integer> reverse(Queue<Integer> queue){
        Stack<Integer> reversed = new Stack<>();

        while (!queue.isEmpty()) {
           var b = queue.remove();
           reversed.push(b);
        }

        while (!reversed.isEmpty()){
            var c = reversed.pop();
            queue.add(c);
        }

        return queue;
    }
}
