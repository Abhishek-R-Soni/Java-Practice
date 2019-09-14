//								Sum of Array
import java.*;

class Array
{
	public static void main(String[] args)
	{
		int a[],sum=0;							//		Array Declaration
		a=new int[5];						//		Array Creation
		
		for(int i=0;i<5;i++)
			sum+=a[i];
			
		System.out.println("Sum :" + sum);
	}
}