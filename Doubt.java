//			Interface
status UserName Password Enter Username & Password
interface I
{txtusername
	void show();
}

class C implements I
{
	public void show()
	{
		System.out.println("Hello System");
	}
}

class Main
{
	public static void main(String[] args)
	{
		new C().show();//			Anonymous Object
	}
}