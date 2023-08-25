package oops;

 class animals
{
	  animals()//constructor
	{
		System.out.println("animal is created");
	}
	  public void m1() //normal method
	  {
		  System.out.println("ztoh");
	  }
}
  class cat extends animals
{
	cat()//constructor
	{
	super();
	System.out.println("dog is created");
}
}
public class Super_constructor {

	public static void main(String[] args) {
		cat c= new cat();
		c.m1();
		
		
		
	}

}
