import java.util.*;

public class NorthWestCornerMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of sources: ");
		int s = sc.nextInt();
		
		System.out.println("enter the no. of destinations: ");
		int d = sc.nextInt();
		
		int supply[] = new int[s];
		int demand[] = new int[d];
		int cost[][] = new int[s][d];
		
		System.out.println("enter the supply: ");
		for(int i = 0; i<s; i++)
		{
			supply[i]=sc.nextInt();
		}
		
		System.out.println("enter the demand: ");
		for(int i = 0; i<d; i++)
		{
			demand[i]=sc.nextInt();
		}
		
		System.out.println("enter the costs: ");
		for(int i = 0; i<s; i++)
		{
			for(int j = 0; j<d; j++)
			{
				cost[i][j]=sc.nextInt();
			}			
		}
		
		System.out.println("the cost matrix is: ");
		for(int i = 0; i<s; i++)
		{
			for(int j = 0; j<d; j++)
			{
				System.out.print(cost[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int allocate[][]=new int[s][d];
		int i=0;
		int j=0;
		while(i<s && j<d)
		{
			allocate[i][j]= Math.min(supply[i], demand[j]);
			
			supply[i] = supply[i] - allocate[i][j];
			demand[j] = demand[j] - allocate[i][j];
			
			if(supply[i] == 0)
			{
				i++;
			}
			if(demand[j]==0)
			{
				j++;
			}
		}
		
		System.out.println("the allocation matrix is: ");
		for(int m = 0; m<s; m++)
		{
			for(int n = 0; n<d; n++)
			{
				System.out.print(allocate[m][n]+" ");
			}
			System.out.println();
		}
		
		int tc=0;
		for(int y=0; y<s; y++)
		{
			for(int z=0; z<d; z++)
			{
				tc+=cost[y][z]*allocate[y][z];
			}
		}
		
		System.out.println("The total cost is "+tc);
	}

}
