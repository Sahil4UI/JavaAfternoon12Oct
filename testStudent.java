
public class testStudent {
	public static void main (String args[])
	{
		Student vishal = new Student();
		vishal.input(100, "Rohit","BCA",80);
//		vishal.roll = 190;
		vishal.setRoll(90);
		
//		vishal.print();
		
		
		String name = vishal.getName();
		System.out.println(name);
		
	}
}
