package dev.shadmanahmed;

public class Tree {

    private class Node {
        private Node leftChild;
        private Node rightChild;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        var current =  root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                 current.leftChild =  new Node(value);
                 break;
                }
                current = current.leftChild;
            }
                else {
                    if (current.rightChild == null) {
                        current.rightChild = new Node(value);
                        break;
                    }
                   current = current.rightChild;
                }
        }
    }


    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value) {
                    current = current.leftChild;
                } else if (value > current.value){
                    current = current.rightChild;
            } else
                return true;
        }
        return false;
    }

    public void traversePreOrder(){
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root){
        if(root == null)
            return;
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseInOrder(){
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root){
        if(root == null)
            return;
        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if( root == null ){
            return -1;
        }

        if (root.leftChild == null && root.rightChild == null){
            return 0;
        }
        return 1 + Math.max(height(root.leftChild),height(root.rightChild));
    }

}
