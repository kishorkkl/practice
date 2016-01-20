package com.practice.generics;

/**
 * Created by sandeep on 22/12/2015.
 */
public class GenericProgramming {


}

class ArrayAlg
{
    /**
     * get max/min of an array of object type T
     * tyoe T is restricted to classes that are of subtype comparable
     */
    public static <T extends Comparable> Pair<T> minmax(T[] a)
    {
        if(a==null||a.length==0) return null;

        T min =a[0];
        T max =a[0];

        for(int i=0;i<a.length;i++)
        {
            if(min.compareTo(a[i])>0)min=a[i];
            if(max.compareTo(a[i])<0)max=a[i];
        }

        return new Pair<>(min,max);
    }
}

class Pair<T>
{
    private T first;
    private T second;

    public Pair(T second, T first) {
        this.second = second;
        this.first = first;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}