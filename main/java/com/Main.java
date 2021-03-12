package com;

public class Main {
    public static void main(String[] args)
    {
        Tree tree=new Tree();
        Node node=new Node(56);
        tree.insert(node,30);
        tree.insert(node,70);
        tree.insert(node,20);
        tree.insert(node,18);
        tree.insert(node,90);
        tree.insert(node,80);

        System.out.println(node.value+"Root value");
    }
}
