import java.util.*;

public class Pattern1
{
	public static void main(String[] args) 
	{
	    int n=7;
		for(int i=1;i<=n;i++)
		{
		    int c = 0;
		    for(int j=1;j<=n-i;j++)
		    {
		        System.out.print(" ");
		    }
		    for(int k=1;k<=i+c;k++)
		    {
		        System.out.print("* ");
		        c=2*c;
		    }
		    System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
		    int c = 0;
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(" ");
		    }
		    for(int k=1;k<=n-i;k++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		
	}
}
