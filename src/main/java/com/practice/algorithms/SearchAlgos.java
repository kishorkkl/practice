package com.practice.algorithms;


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
    SearchAlgos.getInstance().testBinarySearch();
}

    private void testBinarySearch()
    {
        int[] a= {1,2,3,4,5,6,7,8,9};
        System.out.println(BinarySearch.indexOf(a,7));
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

/**
 * TODO
 * 1. BST -> Binary search tree
 * 2. RedblackBST
 * 3. Sequential search
 * 4. LinearProbing Hash
 * 5. Separate Chaining Hash
 */


