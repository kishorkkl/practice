package com.practice.collections;


/**
 * Created by sandeep on 21/12/2015.
 */
public class Lists {

public static void main(String[] args)
{
    Lists list = new Lists();
    list.testLinkedListSort();
}

    private void testLinkedListSort()
    {
        LinkedListSort llSorter = new LinkedListSort();
        LinkedListSort.Node ll= llSorter.create();
        llSorter.print(ll);

    }
}


class LinkedListSort
{
    public class Node {
        int val;
        Node next;

        Node(int v, Node t) {
            val = v;
            next = t;
        }

    }

    Node create()
    {
        Node a= new Node(0,null);

        for(int i=0;i<10;i++)
        {
            a.next= new Node(i,a.next);
        }

        return a;
    }

    void print(Node h)
    {
        for(Node t=h.next;t!=null;t=t.next)
        {
            System.out.println("Node value->"+t.val);
        }
    }
}