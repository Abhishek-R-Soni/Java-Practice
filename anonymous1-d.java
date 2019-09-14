//										Anonymous_Array(1-D)
import java.lang.*;

class Anony
{
	public static void main(String...args)
	{
		sum(new int[] {10,20,30});	//Anonymous_Array
	}
	public static void sum(int...x)
	{
		int total=0;
		
		for(int x1:x)
		{
			total+=x1;
		}
		System.out.print("Sum : "+total);
	}
}