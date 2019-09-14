//	Abstract class

abstract class I{
	protected abstract void print();
	public static void dis(){
		System.out.print("Dis");
	}
}

class C extends I{
	private void print(){
		System.out.print("XYZ");
	}
}

class Main{
	public static void main(String... args){
		C c = new C();
		c.dis();
	}
}