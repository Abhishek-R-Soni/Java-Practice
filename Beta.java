interface I{
	void static dis();
}
class Beta implements I{
	public static void main(String...args){
		System.out.println("Beta");
		dis();
	}
	
	public static void dis()
	{
		System.out.println("In Interface");
	}
}