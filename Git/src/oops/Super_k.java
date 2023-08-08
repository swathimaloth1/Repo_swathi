package oops;
class super1
{
	int a=10;
	public  void super1()
	{
		int a=10;
		int b=20;
	      int res=a+b;
		System.out.println(res);
	}
	public  void super12()
	{
		int a=10;
		int b=100;
	      int res=a+b;
		System.out.println(res);
	}
}
    class super2 extends super1
{
	
	
	
	{
		super.super1();
		super.super12();
		
		int a=30;
		int b=20;
	      int res=a-b;
		System.out.println(res);
	}
}


public class Super_k {

	public static void main(String[] args) {
		super2 s= new super2();
		
		
		
		
	}

}
