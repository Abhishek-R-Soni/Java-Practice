import java.util.*;

class Border
{
		public static void main(String...args)
		{
				/*String picture[] = {"ab","df"};
				int c=0;
				String border[] = new String[picture.length + 2];
				
				// make array null free
				for(int i=0;i<border.length;i++)
					border[i]="";
				
				// modify picture array with borders
				
				for(int i=0;i<picture[0].length() + 2;i++)
					border[c] += "*";
				
				for(int i=0;i<picture.length;i++)
					border[++c] = "*" + picture[i] + "*";
				c++;
				for(int i=0;i<picture[0].length() + 2;i++)
					border[c] += "*";
				
				for(int i=0;i<border.length;i++)
					System.out.println(border[i]);*/
				
				int a[]={1,2,3};
				int b[]={1,2,3};
				
				if(Arrays.equals(a,b))
					System.out.println("True");
				
				System.out.println("False");
		}
}