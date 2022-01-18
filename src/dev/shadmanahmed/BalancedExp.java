package dev.shadmanahmed;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExp {

    private final List<Character>leftBrackets = Arrays.asList('(','<','[','{');
    private final List<Character>rightBrackets = Arrays.asList(')','>',']','}');

    public boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();
        var arr = str.toCharArray();

        for (char ch : str.toCharArray()) {
           if (isLeftBracket(ch)) {
               stack.push(ch);
           }

           if (isRightBracket(ch))   {
               if (stack.empty()) return false;

               var top = stack.pop();
               if (!bracketsMatch(ch, top))
                   return false;
            }
        }
        return stack.empty();
    }

    private boolean isRightBracket(char ch){
        System.out.println(ch);
          System.out.println(rightBrackets.contains(ch));
       return (rightBrackets.contains(ch));
    }

    private boolean isLeftBracket(char ch){
        return (leftBrackets.contains(ch));
    }

    private boolean bracketsMatch(char left, char right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
