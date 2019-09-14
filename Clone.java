class Clone implements Cloneable{
	int rollno;
	String name;
	
	public Clone(int rollno,String name){
		this.rollno = rollno;
		this.name = name;
	}
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
	public static void main(String...args)
	{
		try{
			Clone c = new Clone(10,"Abhi");
			Clone c1 = (Clone)c.clone();
			c.name = "Kavi";
			System.out.println("Name : " + c.name);
			System.out.println("Name : " + c1.name);
		}
		catch(CloneNotSupportedException e){
			System.out.println("Error : " + e);
		}
	}
}