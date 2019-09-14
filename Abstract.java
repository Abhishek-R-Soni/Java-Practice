//				Concept of Abstract

abstract class Abstract
{
	int Total;
	
	public void sum(int no1,int no2)
	{
		Total=no1+no2;
	}
	
	abstract void dis();
}

class SubAbstract extends Abstract
{
	void dis()
	{
		System.out.println("Total : " + Total);
	}
}

class Main
{
	public static void main(String[] args)
	{
		SubAbstract ab=new SubAbstract();
		
		ab.sum(10,20);
		ab.dis();
	}
}
