package oops;
class super1
{
	public static final int b = 0;
	int a=10;
	public void  super1()
	{
		int a=10;
		int b=20;
	      int res=a+b;
		System.out.println("The addition is:" +res);
	}
	public  void super12()
	{
		int a=10;
		int b=100;
	      int res=a*b;
		System.out.println("The multiplication"+res);
	}
}
    class super2 extends super1
{
	{
		
		super.super1();
		super.super12();
		
		int b=4;
	      int res=super.a-b;
		System.out.println("The substraction is: "+res);
		
		
		}
	public void m1()
	{
		int a=10,b=29;
		int res;
		res=a+b;
		System.out.println("m1: "+res);
	}
	
	}
public class Super_k {

	public static void main(String[] args) {
		super2 s= new super2();
		s.m1();
	
	           
		
		
		
	}

}
