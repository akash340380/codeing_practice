import java.util.*;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] a = new int[]{8,2,2,1,3,4};
        int n = a.length;
        for(int i=1;i<n;i++)
        {
            int j = i-1;
            int key = a[i];
            while(j>=0 && a[j]>key)
            {
                a[j+1] = a[j];
                j-=1;
            }
            a[j+1] = key;
        }

        for(int i = 0;i<n;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
}
