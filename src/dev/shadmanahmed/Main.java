package dev.shadmanahmed;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(3);
        tree.insert(9);
        tree.insert(4);
        tree.insert(10);
        System.out.println(tree.find(11));

//        HashTable hashTable = new HashTable();
//        hashTable.put(1,"hello");
//        hashTable.put(2,"my");
//        hashTable.put(3,"name");
//        hashTable.put(4,"is");
//        hashTable.put(6,"not");
//        hashTable.put(11,"it");
//        var a = hashTable.get(1);
//        System.out.println(a);

//
//        var firstRepeatedChar = new FirstRepeatedChar();
//
//        System.out.println(firstRepeatedChar.firstRepeat("green apple"));

//        Set<Integer> set = new HashSet<>();
//        int[] nums = {1,2,2,3,4,5,6,3,7,10};
//        for (var number: nums) {
//            set.add(number);
//        }
//        System.out.println(set);

//        var nonRepeat = new NonRepeatedChar();
//        System.out.println(nonRepeat.firstNonRepeat("a green apple"));

//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "mosh");
//        map.put(2, "john");
//        map.put(3, "mart");
//        map.put(4, "damn");
//
//        map.remove(3);
//        System.out.println(map.get(4));
//
//        for (var item:
//             map.entrySet()) {
//            System.out.println(item.getValue());
//        }
//        QueueWith2Stacks queue = new QueueWith2Stacks();
//
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        System.out.println(queue.dequeue());

//       ArrayQueue queue = new ArrayQueue(5);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        System.out.println(queue.dequeue());
//        System.out.println(queue);



//        Queue<Integer> queue = new ArrayDeque<>();
//        for (int i = 0; i < 10; i++) {
//            queue.add(i);
//        }
//        System.out.println(queue);
//        System.out.println(ReverseQueue.reverse(queue));
//
//        var stacked = new Stack();
//        stacked.push(5);
//        stacked.push(6);
//        stacked.push(7);
//        stacked.push(8);
//        stacked.push(9);
//
//        System.out.println(stacked.pop());
//
////        System.out.println(stacked.peek());
//
//        stacked.show();
//        System.out.println(stacked.isEmpty());


//        String str = "(<34>)";
//        var balancer = new BalancedExp();
//
//        System.out.println(balancer.isBalanced(str));


//        String str = "abcdef";
//        var strrev = new StringReverser();
//        System.out.println(strrev.reverse(str));

//        var list = new LinkedList();
//        for (int i = 10; i < 20; i++) {
//            list.addLast(i);
//        }
//
//        System.out.println(list.getKthFromTheEnd(30));

//        list.reverse();
//        list.deleteFirst();
//        System.out.println(list.contains(-100));

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
//        LinkedList list = new LinkedList();
//        //can be any dataType or can be defined
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addFirst("hello");
//        System.out.println(list.indexOf(10));
//        System.out.println(list.size());
//        var array = list.toArray();
//        System.out.println(array);
//
//
//        System.out.println(list);
    }
}
