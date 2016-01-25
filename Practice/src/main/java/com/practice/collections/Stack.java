package com.practice.collections;

/**
 * Created by sandeep on 23/01/2016.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

//import java.util.Stack

public class Stack {

    public static void main(String[] args)
    {

    }

    private void testFixedCapacityStackOfStrings()
    {
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);

        try {
            Scanner sc = new Scanner(new File("d:\\test.txt"));


            while (sc.hasNext()) {
                String item = sc.nextLine();
                System.out.println(item);

                if (!item.equals("-"))
                    s.push(item);
                else if (!s.isEmpty()) System.out.println(s.pop() + " ");
            }

            System.out.println("(" + s.size() + " left on stack)");
        }catch(FileNotFoundException exception)
        {
            exception.printStackTrace();
            throw new RuntimeException("File Not found");
        }
    }


}

/*
       Stack Implementation with following drawbacks.
       a)Fixed size array.
       b)Non Generic
       c)Loiterring.
       d)
 */
class FixedCapacityStackOfStrings
{
    private String[] a; // stack entries
    private int N; // size

    public FixedCapacityStackOfStrings(int cap)
    { a = new String[cap]; }
    public boolean isEmpty() { return N == 0; }
    public int size() { return N; }
    public void push(String item)
    { a[N++] = item; }
    public String pop()
    { return a[--N]; }
}

/*
    Stack implementation corrected for above defects. LIFO
 */
class ResizingArrayStack<T> implements Iterable<T>
{
    private T[] a = (T[]) new Object[1]; // stack items
    private int N = 0; // number of items
    public boolean isEmpty() { return N == 0; }

    public int size() { return N; }

    private void resize(int max)
    { // Move stack to a new array of size max.
        T[] temp = (T[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = a[i];
        a = temp;
    }
    public void push(T item)
    { // Add item to top of stack.
        if (N == a.length) resize(2*a.length);
        a[N++] = item;
    }
    public T pop()
    { // Remove item from top of stack.
        T item = a[--N];
        a[N] = null; // Avoid loitering (see text).
        if (N > 0 && N == a.length/4) resize(a.length/2);
        return item;
    }
    public Iterator<T> iterator()
    { return new ReverseArrayIterator(); }

    private class ReverseArrayIterator implements Iterator<T>
    { // Support LIFO iteration.
        private int i = N;
        public boolean hasNext() { return i > 0; }
        public T next() { return a[--i]; }
        public void remove() { }
    }
}

/*
    Linked list implementation of Stack
    a) push in from first position
    b) pop back from first position
 */
class StackLL<T>
{
    private Node first; // top of stack (most recently added node)
    private int N; // number of items
    private class Node
    { // nested class to define nodes
        T item;
        Node next;
    }
    public boolean isEmpty() { return first == null; } // Or: N == 0.
    public int size() { return N; }
    public void push(T item)
    { // Add item to top of stack.
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }
    public T pop()
    { // Remove item from top of stack.
        T item = first.item;
        first = first.next;
        N--;
        return item;
    }
}