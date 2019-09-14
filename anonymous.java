//										Anonymous_Array(2-D)
import java.lang.*;

class Anony
{
	public static void main(String...args)
	{
		dis(new int[][] {{10,20,30},{40,50,60}});	//Anonymous_Array
	}
	public static void dis(int[][] x)
	{
		for(int i=0;i<2;i++)
			for(int j=0;j<3;j++)
				System.out.println(x[i][j]);
	}
}