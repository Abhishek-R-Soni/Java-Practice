//						3-D Array
class Array
{
	public static void main(String[] args)
	{
		int[][][] ar=new int[2][][];
	
		 ar[0] =new int[2][2];
		 ar[1] =new int[2][2];
		 
		 ar[0][0][0]=10;
		 ar[0][0][1]=20;
		 
		 ar[0][1][1]=30;
		 ar[1][1][1]=40;
		 
		 System.out.println(ar[0][0][0] + " " + ar[0][0][1] + " " + ar[0][1][1] + " " + ar[1][1][1]);
	}
}