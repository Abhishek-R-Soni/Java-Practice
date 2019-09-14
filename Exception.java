import java.util.*;
class Exception
{
	public static void main(String[] args)throws Exception
	{
		
		int a=10,b=0;
		
		try
		{
			int k=a/b;
		}
		catch (Exception e)
		{
			System.out.println("Can not Divide" + (a+b));
	
		}
	}
}