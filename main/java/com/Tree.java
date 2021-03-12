package com;
public class Tree {
    public void insert(Node node,int value)
    {
        if(value < node.value)
        {
            if(node.left !=null) {
                insert(node.left, value);
            }else
            {
                System.out.println("insert "+value+ "to left of"+node.value);
                node.left=new Node(value);
            }
        }
    }
}
