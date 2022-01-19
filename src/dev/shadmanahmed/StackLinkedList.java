package dev.shadmanahmed;

import java.util.LinkedList;

public class StackLinkedList {
  LinkedList<Integer> stack = new LinkedList<>();

  public void push(int num){
      stack.addFirst(num);
  }

  public int pop(){
      return stack.removeFirst();
  }

  public int peek(){
      if (stack.isEmpty()){
          throw new IllegalStateException();
      }else {
          return stack.peek();
      }
  }

  public boolean isEmpty(){
      return stack.isEmpty();
  }

  public void show(){
      System.out.println(stack.toString());
  }

}
