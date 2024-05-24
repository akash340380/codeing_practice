import java.util.*;

public class Frequency
{
    public static void main(String[] args)
    {
        Integer[] a = new Integer[]{23,5,23,9,3,3};
        List<Integer> al = Arrays.asList(a);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0;i<al.size();i++)
        {
            if(hm.containsKey(al.get(i)))
            {
                hm.put(al.get(i),(hm.get(al.get(i))+1));
            }
            else
            {
                hm.put(al.get(i),1);
            }
        }
        System.out.println(hm);
    }
}