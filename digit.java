//									Operation on No

import java.util.*;
class Digit
{
	public static void main(String[] args)
	{
		int no,temp,cnt=0,rem,rev=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\n Enter No : ");
		no=sc.nextInt();
		
		temp=no;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=(rev*10) + rem;
			temp=temp/10;
			cnt++;
		}
		
		System.out.print("\n" + no + " Contain " + cnt + " Digits.");		//No of Digits
		System.out.println("\n" + no + " is Reversed " + rev);				//No Reverse
	}
}