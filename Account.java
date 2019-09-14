import java.util.*;

class Account
{
	static Scanner sc=new Scanner(System.in);
	
	int Acc_no;
	String Name,Branch;
	
	public void getCustInfo()
	{
		System.out.println("\nEnter Customer Info...");
		System.out.println("***** ******** ****");
		
		System.out.print("\nEnter Cust Acc_No :");
		Acc_no=sc.nextInt();
		
		System.out.print("\nEnter Cust Name   :");
		Name=sc.next();
		
		System.out.print("\nEnter Cust Branch :");
		Branch=sc.next();
		
		System.out.println("***** ******** ****");
	}
	
	public void displayInfo()
	{
		System.out.println("***** ******** ****");
		System.out.println("Customer Account No :" + Acc_no);
		System.out.println("Customer Name :" + Name);
		System.out.println("Customer Branch :" + Branch);
	}
}

class Saving extends Account
{
	int Amount;
	static float Rate=3.5f;
	float Year;
	
	public void getSavingInfo()
	{
		System.out.println("\nEnter Saving Info...");
		System.out.println("***** ******** ****");
		
		System.out.print("\nEnter Saving Amount :");
		Amount=sc.nextInt();
		
		System.out.print("\nEnter Saving Year  :");
		Year=sc.nextInt();
		
		System.out.println("***** ******** ****");
	}
	
	public float CallAmt(int Amount,float Rate,float Year)
	{
		return (float)(Amount * Rate * Year)/100;
	}
	public void displaySVInfo()
	{
		System.out.println("***** ******** ****");
		System.out.println("Customer Amount:" + Amount);
		System.out.println("Customer Rate :" + Rate);
		System.out.println("Customer Year :" + Year);
		float com;
		com=CallAmt(Amount,Rate,Year);
		System.out.println("Customer Total Amount :" + com);
	}
}

class FixedDeposit extends Account
{
	int Amount;
	static float Rate;
	float Year;
	
	public void getFDInfo()
	{
		System.out.println("\nEnter FixedDeposit Info...");
		System.out.println("***** *********** ****");
		
		System.out.print("\nEnter FD Amount :");
		Amount=sc.nextInt();
		
		System.out.print("\nEnter FD Year  :");
		Year=sc.nextInt();
		
		if(Year > 0 && Year <=2)
			Rate=6.5f;
		else if(Year >2 && Year <=5)
			Rate=7.5f;  
		else if(Year >5 && Year <=10)
			Rate=8.5f;
		else
			Rate=9.0f;
		
		System.out.println("***** ******** ****");
	}
	
	public float CallAmt(int Amount,float Rate,float Year)
	{
		return (float)(Amount * Rate * Year)/100;
	}
	
	public void displayFDInfo()
	{
		System.out.println("***** ******** ****");
		System.out.println("Customer Amount:" + Amount);
		System.out.println("Customer Rate :" + Rate);
		System.out.println("Customer Year :" + Year);
		float com;
		com=CallAmt(Amount,Rate,Year);
		System.out.println("Customer Total Amount :" + com);
	}
}

class AccountDetail extends Account
{
	public static void main(String []args)
	{
		int ch;
		boolean on=true;
		do
		{
			System.out.println("\nChoose Account Type ...\n");
			System.out.println("1)Saving");
			System.out.println("2)Fixed Deposit");
			System.out.println("3)Exit");
			System.out.print("Enter your choice :");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
					Saving sv=new Saving();
					
					sv.getCustInfo();
					sv.getSavingInfo();
				
					System.out.println("***************************************");
					System.out.println("Customer Saving Account Details...");
					System.out.println("***************************************");
					sv.displayInfo();
					sv.displaySVInfo();
					break;	
					
				case 2:
					FixedDeposit fd=new FixedDeposit();
					
					fd.getCustInfo();
					fd.getFDInfo();
					
					System.out.println("***************************************");
					System.out.println("Customer Fixed Deposit Account Details...");
					System.out.println("***************************************");
					fd.displayInfo();
					fd.displayFDInfo();
					break;
					
				case 3:
					on=false;
			}
			
		}while(on);
	}
}