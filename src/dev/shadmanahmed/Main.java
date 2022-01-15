package dev.shadmanahmed;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        Array numbers = new Array(3);
//        numbers.insert(10);
//        numbers.insert(20);
//        numbers.insert(30);
//        numbers.insert(40);
////        numbers.removeAt(4);
//        System.out.println(numbers.indexOf(100));
//        numbers.print();
//
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(0);
//        list.remove(0);
//        list.indexOf(10);
//        list.lastIndexOf(20);
//        list.contains(20);
//        list.size();
//        list.toArray();
        LinkedList list = new LinkedList();
        //can be any dataType or can be defined
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst("hello");
        System.out.println(list.indexOf(10));
        System.out.println(list.size());
        var array = list.toArray();
        System.out.println(array);


        System.out.println(list);
    }
}
