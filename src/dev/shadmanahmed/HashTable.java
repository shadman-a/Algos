package dev.shadmanahmed;

import java.util.LinkedList;

public class HashTable {

    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        var index = hash(key);
        if (entries[index] == null)
            entries[index] =  new LinkedList<>();

        for (var entry: entries[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        var entry = new Entry(key, value);
        entries[index].addLast(entry);
    }

    public String get(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if (bucket !=null){
            for (var entry : bucket) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }
        throw new StringIndexOutOfBoundsException();
    }
    private int hash(int key) {
        return key % entries.length;
    }


    public void remove(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if (bucket == null){
            throw new IllegalStateException();
        }
        for (var entry: bucket) {
            if (entry.key == key) {
                bucket.remove(entry);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
