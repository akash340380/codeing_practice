import java.util.*;

class SelectionSort
{
    public static void main(String[] args) {
        int[] a = new int[]{
                4, 33, 1, 2, 9, 2
        };
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = a[i];
            int idx = i;
            for(int j = i+1;j<n;j++)
            {
                if(a[j]<min)
                {
                    min = a[j];
                    idx = j;
                }
            }
            int temp = a[i];
            a[i] = a[idx];
            a[idx] = temp;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }


}
}