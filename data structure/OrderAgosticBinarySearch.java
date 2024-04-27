//Order agnostic binary search

import java.util.*;

public class OrderAgosticBinarySearch
{
    public static void main(String[] args)
    {
        int[] a = new int[]{55,33,22,1};

        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();

        boolean asc = isAsc(a);

        if(asc)
            System.out.println(bAscSearch(a,target));
        else
            System.out.println(bDscSearch(a,target));

    }

    static boolean isAsc(int[] a)
    {
        if(a[0]<a[a.length-1])
        {
            return true;
        }
        return false;
    }
    static int bAscSearch(int[] a,int target)
    {
        int s = 0;
        int e = a.length-1;
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(target<a[mid])
            {
                e = mid - 1;
            }
            else if(target>a[mid])
            {
                s = mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    static int bDscSearch(int[] a,int target)
    {
        int s = 0;
        int e = a.length-1;
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(target>a[mid])
            {
                e = mid - 1;
            }
            else if(target<a[mid])
            {
                s = mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
