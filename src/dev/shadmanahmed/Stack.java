package dev.shadmanahmed;

public class Stack {
    int stack[] = new int[5];
    int top = 0;

    public void push(int data){
        if (top == stack.length){
            throw new StackOverflowError();
        }
        stack[top]=data;
        top++;
    }

    public int pop(){
        if (top == 0) {
            throw new IllegalStateException();
        }
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peek(){
        return stack[top -1];
    }

    public boolean isEmpty(){
        return(stack[0] == 0 );
    }

    public void show(){
        for (int n : stack){
            System.out.println(n+" ");
        }
    }

}
