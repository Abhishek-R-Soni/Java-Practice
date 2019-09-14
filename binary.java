//			Binary Search

import java.util.*;

class Binary
{
	public static void main(String...args)
	{
		int s,m,e,no;
		
		int a[]=new int[10];
				
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array Element(<10) :");	//Print Message

		for(int i=0;i<5;i++)	//For loop To print Message & Take Values at runtime
		{		
			System.out.print("Enter Element :");
			a[i]=sc.nextInt();
		}
		
		System.out.print("Enter Search No :");
		no=sc.nextInt();
				
		s=a[0];
		e=5;
		int cnt=0;
		
		while(true)
		{
			m=(s+e)/2;
			
			if(no > m)
			{
				s=m+1;
				cnt++;
			}
			else if(no < m)
			{
				e=m-1;
				cnt++;
			}
			else if(no == m)
			{
				System.out.println("Found Your No: "+ no +" Count :"+cnt);
				break;
			}
			else if(s > e)
			{
				System.out.println("Enter Correct No...!");
				break;
			}
		}
	}
}