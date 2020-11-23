
public class RecursiveFunction {
//	
//	static void MyFunction(int x)
//	{
//		base case
//		if (x<1) {
//			return;
//		}
//			
//		
//		
//		System.out.println(x);
//		MyFunction(x-1);
//	}
//	
	static int factorial(int x)
	{
		if (x ==1)
		{
			return 1;
		}
		return x*factorial(x-1);
	}
	
	
	
//	Homework
//	-Find the Power of a number using recursion
//	print the following sequence using recursion -  1234554321
	
	
	public static void main(String[] args) {
		
//		RecursiveFunction obj= new RecursiveFunction();
		
//		MyFunction(10);
		
		System.out.println(factorial(5));
	}
}

