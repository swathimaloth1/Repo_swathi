package oops;

public class Superkey {
	public static void main(String[] args) {
		Superkey2 s = new Superkey2();
		s.printcolour();

	}
}

	class Superkey1 {
		String colour = "white";

	}

class Superkey2 extends Superkey1 {
		String colour = "black";

		public void printcolour() {
			 System.out.println(colour);//prints colour of Superkey
			System.out.println(super.colour);// prints colour of Superkey1

		}
	}

