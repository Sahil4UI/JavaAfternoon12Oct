
class FOO{
//	Default function - without argument & without return type
//	void show()
//	{
//		System.out.println("This is  default Function");
//	}
	
	
//	without argument & with return type

	int show()
	{
		return 10;
	}
	
//	with argument & without return type
//	void addition(int x,int y)
//	{
//		System.out.println("sum="+(x+y));
//	}
	
	int addition(int x,int y)
	{
		return x+y;
	}
}

public class Functions{
	public static void main(String[] args) {
		FOO obj = new FOO();
		System.out.println(obj.show());
		System.out.println(obj.addition(10, 20));
	}
}
