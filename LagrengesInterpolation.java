import java.util.*;
public class LagrengesInterpolation
{
	public static void main(String[] args) 
	{
		double sum=0;
	    Scanner sc= new Scanner (System.in);
		System.out.println("enter number of values to be calculated :");
		int n=sc.nextInt();
		
		System.out.println("enter value of m :");
		int m=sc.nextInt();
		
		System.out.println("enter x values :");
		int x[]= new int[n];
		for(int i = 0; i<n; i++)
		{
		    x[i]=sc.nextInt();
		}
		
		System.out.println("enter y values :");
		int y[]= new int[n];
		for(int i = 0; i<n; i++)
		{
		    y[i]=sc.nextInt();
		}
		
		System.out.println("values of x :");
		for(int i = 0; i<n; i++)
		{
		    System.out.println(x[i]);
		}
		
		System.out.println("values of y :");
		for(int i = 0; i<n; i++)
		{
		    System.out.println(y[i]);
		}		
		
		for(int i=0; i<n; i++)
		{
		    double a=1.0;
		    double b=1.0;
		    double r=1.0;
		    for(int j=0; j<n; j++)
		    {	
		    	if(x[j]!=x[i])
		    	{
		    		a = a*(m-x[j]);
		    		b = b*(x[i]-x[j]);
		    	}
		    }
		    r=(a/b)*y[i];
		    sum =sum + r;
		}
		
		System.out.println(sum);
		
	}
}

