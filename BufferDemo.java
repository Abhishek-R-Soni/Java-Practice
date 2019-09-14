class BufferDemo{
	public static void main(String...args){
		StringBuffer buf = new StringBuffer("Abhishek");
		
		System.out.println(buf.length() + " " + buf.capacity() + " " + buf.append(" Soni") + " "
		+ buf.insert(4,"...") + " " + buf.reverse());
	}
}