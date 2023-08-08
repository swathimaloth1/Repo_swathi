package oops;
class staticvariable{
	static int a=10;
	int b;
	int c;
	static void addition()
	{
		int b=20;
		int res=a+b;
		System.out.println("The addition is: "+res);
	}
	static void mul()
	{
		int b=10;
		int c=2;
		int res=a*b*c;
		
		System.out.println("The multiplication is: "+res);
	}
	static void sub()
	{
		int b=20;
		int res=b-a;
		System.out.println("The addition is: "+res);
	}
}

public class Statick {
	public static void main(String[] args) {
		
		staticvariable.addition();
		staticvariable.mul();
		staticvariable.sub();
	}

}
