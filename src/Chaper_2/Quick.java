package Chaper_2;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by Kevin on 2016/2/6.
 */
public class Quick {

    public static void sort(Comparable[] a)
    {
        StdRandom.shuffle(a);
        sort(a,0,a.length);
    }
    public static void sort(Comparable[] a,int lo,int hi)
    {
        if(hi<=lo) return;
        int j=0;
        sort(a, lo, j-1);
        sort(a,j+1,hi);

    }
    public static boolean less(Comparable v,Comparable w)
    {
        return v.compareTo(w)<0;
    }
    public static void exch(Comparable[] a,int i,int j)
    {
        Comparable t = a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static void show(Comparable[] a)
    {
        for(int i = 0;i<a.length;i++)
        {
            StdOut.print(a[i]+" ");
            StdOut.println();
        }
    }

    public static boolean isSorted(Comparable[] a)
    {
        for(int i =1;i<a.length;i++)
            if (less(a[i],a[i-1])) return false;
            return true;

    }

    private static int partiton(Comparable[] a,int lo,int hi)
    {
        int i=lo,j=hi+1;
        Comparable v = a[lo];
        while(true)
        {
            while(less(a[++i],v)) if(i==hi) break;
            while(less(v,a[--j])) if(j==lo) break;
            if(i>=j);
            exch(a,i,j);
        }
    }
}
