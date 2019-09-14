//							Operation on Digit(2)

import java.util.*;

class Digit2
{
	public static void main(String[] args)
	{
		int[] no=new int[5];
		int cnt=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println();
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter No : ");
			no[i]=sc.nextInt();
		}
		
		System.out.print("\nEnter Digit : ");
		int dig=sc.nextInt();
		
		for(int i=0;i<5;i++)
		{
			if(dig==no[i])
			{
				cnt++;
			}
		}
		
		System.out.println("\n"  + dig + " Occurs " + cnt + " times.");
	
		System.out.print("\nEnter Digit : ");
		dig=sc.nextInt();
		
		for(int i=dig;i<5;i++)
		{
			System.out.print(no[i] + " ");
		}
	}
}