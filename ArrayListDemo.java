import java.util.*;
class ArrayListDemo
{
	public static void main(String...a)
	{
		ArrayList<String> list=new ArrayList<String>();
		
		//Add Data in ArrayList
		list.add("Abhi");
		list.add("Dhimant");
		list.add(123);
		for(String s:list)
			System.out.println(s);

		//Add Data in ArrayList
		list.remove("Abhi");
		
		for(String s:list)
			System.out.println(s);
	}
}