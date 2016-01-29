package com.practice.algorithms;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sandeep on 29/12/2015.
 */
public class SearchAlgos {

private static SearchAlgos algos = new SearchAlgos();

private  SearchAlgos(){}

public static  SearchAlgos getInstance()
{
    return algos;
}

public static void main(String[] args)

{
//    SearchAlgos.getInstance().testBinarySearch();
    SearchAlgos.getInstance().testSequentialSearchST();
}

    private void testBinarySearch()
    {
        int[] a= {1,2,3,4,5,6,7,8,9};
        System.out.println(BinarySearch.indexOf(a,7));
    }

    private void testSequentialSearchST()
    {
        int minlen = 3;
        SequentialSearchST<String, Integer> st = new SequentialSearchST<String, Integer>();

        Charset charset = Charset.forName("US-ASCII");

        //Try with resources statement.
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("d:\\test.txt"), charset)) {
            String word = null;
            while ((word = reader.readLine()) != null) {
                System.out.println(word);

                if (!st.contains(word)) st.put(word, 1);
                else st.put(word, st.get(word) + 1);
            }

            // Find a key with the highest frequency count.
            String max = "";
            st.put(max, 0);
            for (String wordMax  : st.getKeys())
                if (st.get(wordMax) > st.get(max))
                    max = wordMax;

            System.out.println(max + " " + st.get(max));

        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }




    }
}

class BinarySearch
{
    private BinarySearch() {}

    public static int indexOf(int[] a,int key)
    {

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }

        return -1;
    }
}

//Symbol Tables Sequential Search

class SequentialSearchST<Key , Value>
{
    private Node first; // first node in the linked list
    int N=0;

    private class Node
    { // linked-list node
        Key key;
        Value val;
        Node next;
        public Node(Key key, Value val, Node next)
        {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    public boolean contains(Key key)
    {
        return !(this.get(key)==null);
    }
    public Value get(Key key)
    { // Search for key, return associated value.
        for (Node x = first; x != null; x = x.next)
            if (key.equals(x.key))
                return x.val; // search hit
        return null; // search miss
    }
    public void put(Key key, Value val)
    { // Search for key. Update value if found; grow table if new.
        for (Node x = first; x != null; x = x.next)
            if (key.equals(x.key))
            { x.val = val; return; } // Search hit: update val.
        first = new Node(key, val, first); // Search miss: add new node.

        N++;
    }

    public List<Key> getKeys()
    {
       List keyArr = new ArrayList<Key>();

        for (Node x = first; x != null; x = x.next) {
            keyArr.add(x.key);
        }

        return  keyArr;
    }
}

/**
 * TODO
 * 1. BST -> Binary search tree
 * 2. RedblackBST
 * 3. Sequential search
 * 4. LinearProbing Hash
 * 5. Separate Chaining Hash
 */


