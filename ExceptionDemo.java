class ExceptionDemo{
	public static void main(String...args)
	{
		int i=10,sum;
	
		try{
			sum = i/0; 
		}
		catch(ArithmeticException e){
			System.out.print(e);
		}
	}
}