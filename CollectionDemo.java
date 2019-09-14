import java.util.*;

class CollectionDemo
{
	public static void main(String...a)
	{
		Collection<Integer> col=new ArrayList<>();
		col.add(10);
		col.add(2);
		col.add(1);
		
		Collctions.sort(col);
		for(Object s:col)	
			System.out.println(s);
	}
}