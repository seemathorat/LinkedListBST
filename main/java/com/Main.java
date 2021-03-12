package com;

public class Main {
    public static void main(String[] args)
    {
        Tree tree=new Tree();
        Node node=new Node(56);
        tree.insert(node,30);
        System.out.println(node.value+"Root value");
    }
}
