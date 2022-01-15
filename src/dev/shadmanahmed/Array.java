package dev.shadmanahmed;


public class Array {
    private int[] items;
    private int count;

    public Array(int length)  {
        items = new int[length];
    }

    public void insert (int item) {
        //if th array is full resize it
        if (items.length == count) {
            //creat a new array (twice the size)
            int[] newItems = new int[count * 2];
            //copy all existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            //set 'items' to this new array
            items = newItems;
        }
        //add the new item at the end
        items[count++] = item;
    }

    public void removeAt (int index) {
        //Validate the index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
            //shift the items to the left to fill the hole
            // [01,20,30,40]
            // index: 1
            // 1 <- 2
            // 2 <- 3

            for (int i  = index; i < count; i++)
                items[i] = items[i +1];
             count--;

    }

    public int indexOf(int item) {
     // If we find it, return index
     // Otherwise, return -1
     // Runtime complexity O(n)

        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
