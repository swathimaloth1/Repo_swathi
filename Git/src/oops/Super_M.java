package oops;

	class animal{
		void eat()
		{
			System.out.println("Eating"); //parent class 
		}
	}
	class dog extends animal
	{
		void eat() //child
		{
			System.out.println("Eating");
		}
		void bark()//child
		{
			System.out.println("Barking");
		}
		void work() //child
		{
			super.eat();
			bark();
		}
	}

public class Super_M {

	public static void main(String[] args) {
		dog d= new dog();
		d.work();
		
	}

}
