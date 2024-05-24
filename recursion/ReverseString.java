import java.util.*;

public class ReverseString
{
    static void rev(String r, int idx)
    {

        if(idx==r.length())
        {
            return;
        }

        char temp=r.charAt(idx);
        rev(r,idx+1);
        System.out.print(temp);
    }

    public static void main(String[] args)
    {
        String s = "Mango";
        rev(s,0);
    }
}
