class Foo{
	int x =500;
}

class E extends Foo{
	int x = 1000;
}

class Bar extends E{
	int x = 2000;
	Bar(int x){
		int z = ((Foo)this).x + ((E)this).x + this.x + x;
		System.out.println(z);
		
	}
}


public class THIS {
	public static void main(String[] args) {
		Bar obj = new Bar(5000);
	}
}
