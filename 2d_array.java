//						Testing With 2 Dimension Array
class Array
{
	public static void main(String[] args)
	{
		int[][] ar=new int[2][];
		
		ar[0]=new int[2];
		ar[1]=new int[3];
		
		ar[0][0]=10;
		ar[0][1]=20;
		
		ar[1][0]=30;
		ar[1][1]=40;
		ar[1][2]=50;

		System.out.println(ar + "\n" + ar[0][0] + " " + ar[0][1]);
		System.out.println(ar[1][1] + " " + ar[1][2]);
	}
}