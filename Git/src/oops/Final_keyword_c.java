package oops;

class finals{
	int a=10,b=20;
	void m1() {
		int res=a+b;
		System.out.println(res);
	}

	
}
final class final2{    //by using final key word in class we cannot extend final class 
	int a=10,b=20;     //but we can create object and called to that method 
	public void m2() {
		int res=a+b;
		System.out.println(res);
	}
}

class final1{
	int a=10,b=20;
	public void m3() {
		int res=a-b;
		System.out.println(res);
	}
}

public class Final_keyword_c {
	public static void main(String[] args) 
	{
	
		final2 f=new final2();
		f.m2();
		
		finals f1=new finals();
		f1.m1();
		
		final1 f2=new final1();
		f2.m3();
	}
		


}
