package com.practice.algorithms;


/**
 * Created by sandeep on 12/01/2016.
 */
public class SortAlgos {

    public static void main(String[] args)
    {
        SortAlgos.testInsertionSort();
        SortAlgos.testSelectionSort();
    }

    private static void testSelectionSort() {
        Double[] tempUnSorted = {10.9,11.1,23.19,98.28,1.37,90.45,80.44,78.67};

        SelectionSort sSort = new SelectionSort();
        sSort.show(tempUnSorted);
        sSort.sort(tempUnSorted);
        sSort.show(tempUnSorted);
    }

    private static void testInsertionSort() {
        Double[] tempUnSorted = {10.9,11.1,23.19,98.28,1.37,90.45,80.44,78.67};

        InsertionSort inSort = new InsertionSort();
        inSort.show(tempUnSorted);
        inSort.sort(tempUnSorted);
        inSort.show(tempUnSorted);
    }
}

abstract class AbstractSort<T extends Comparable>
{
    public abstract void sort(T[] a);

    protected boolean less(T v, T w)
    {  return v.compareTo(w) < 0; }

    protected void exchange(T[] a, int i, int j)
    { T t = a[i]; a[i] = a[j]; a[j] = t; }

    protected void show(T[] a){

       StringBuffer strBuf = new StringBuffer();

       for (int i = 0; i < a.length; i++)
            strBuf.append(a[i] + " ");

        System.out.println(strBuf.toString());
    }

    public boolean isSorted(T[] a)
    {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

}

  class SelectionSort<T extends Comparable> extends AbstractSort{

    public void sort(Comparable[] a)
    {
        for (int j = 0; j < a.length; j++) {
            int min=j;
            for (int k = j; k < a.length; k++) {
                if(this.less(a[k],a[min])) {
                    min=k;
                }
            }
            this.exchange(a,j,min);
        }
    }
}

class InsertionSort<T extends Comparable> extends AbstractSort{

    public void sort(Comparable[] a)
    {
        for (int j = 0; j < a.length; j++) {
              for (int k = j; k > 0; k--) {
                if(this.less(a[k],a[k-1])) {
                    this.exchange(a,k,k-1);
                }
            }

        }
    }
}