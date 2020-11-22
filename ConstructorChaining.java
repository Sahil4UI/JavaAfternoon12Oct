
public class ConstructorChaining {
	
	public ConstructorChaining() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Default Constructor");
		
	}
	
	public ConstructorChaining(int a) {
		// TODO Auto-generated constructor stub
		this();
		System.out.println("a = "+a);
	}
	
	public ConstructorChaining(int a , int b) {
		// TODO Auto-generated constructor stub
		this(a);
		System.out.println("a = "+a+"b="+b);
	}
	
	public ConstructorChaining( int a, int b , int c ) {
		this(a,b);
		// TODO Auto-generated constructor stub
		System.out.println("a = "+a+"b="+b+"c="+c);
	}
	
	public ConstructorChaining(int a , int b , int c , int d) {
		this(a,b,c);
		// TODO Auto-generated constructor stub
		System.out.println("a = "+a+",b="+b+",c="+c+",d="+d);
	}

}
