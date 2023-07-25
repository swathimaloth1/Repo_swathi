package oops;
class student{
	
	public static void marks() {
		int m1=10;
		int m2=20;
		final int m3=5;
		//m3=8;
		int res=m1+m2+m3;
		System.out.println(res);
		
		
	}
}

public class Final_keyword_variable {
	public static void main(String[] args) {
//		student s= new student(); //if this method is without static we need to create object
//		s.marks();
////	
		student.marks();  //this is static method so we no need to create object
			
		
	}

}
