//											Bubble Sort
import java.util.*;	//Import Java Package

class BubbleSort	//Class Declaration
{
	public static void main(String...args)	//Main Function
	{
		int a[]=new int[5];	//Array Declaration & Creation
		
		Scanner sc=new Scanner(System.in);	//Load Scanner Class	

		System.out.println("Enter Array Element(<6) :");	//Print Message

		for(int i=0;i<5;i++)	//For loop To print Message & Take Values at runtime
		{		
			System.out.print("Enter Element :");
			a[i]=sc.nextInt();
		}
			
		for(int i=0;i<a.length;i++)	//Main logic of Bubble Sort
			for(int j=0,k=j+1; j<4 ;j++,k++)
			{
				int temp=0;
				
				if(a[j] > a[k])
				{
					temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
				
		for(int i=0;i<a.length;i++)	//Display Final Output
			System.out.print(a[i]+" ");
	}
}