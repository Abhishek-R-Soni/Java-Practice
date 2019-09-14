//					File Concept
//import Throwable ;
import java.util.*;
import java.io.*;

public class File 
{
	public static void main(String[] args)throws IOException
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("\nEnter Data :");
		String str=sc.nextLine();
		
		 //File f=new File("DDU.txt");		  
	
		FileOutputStream fos=new FileOutputStream("Demo.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeUTF(str);
		
		FileInputStream fis=new FileInputStream("Demo.txt");
		DataInputStream dis=new DataInputStream(fis);
		str=dis.readUTF();
		
		System.out.println("\nFile Contain...");
		System.out.println(str);
	}
}
