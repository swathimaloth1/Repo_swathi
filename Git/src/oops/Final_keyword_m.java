package oops;

class mymarks{
	int m1=20,m2=30;
	int m3=40;
	final void marks() {
		int tot=m1+m2;
		System.out.println("m1 and m2 marks are-------------- :"+tot);
	}
	 void marks1() {
		int tot=m1+m2+m3;
		System.out.println("m1 and m2 and m3 marks are ..........are :"+tot);
		
	}
	
}
class totalmarks extends mymarks{
//	final void marks() {
//		int tot=m1+m2;
//		System.out.println("m1 and m2 amrks are :"+tot);
//	}
	
	
	void markss() {
	
		int tot=m1+m2+m3+m3;
		System.out.println("m1 and m2 and m3 marks ===========are :"+tot);
		
	}
	
}
public class Final_keyword_m {
	public static void main(String[] args) {
		totalmarks m=new totalmarks();
		m.marks();
		m.marks1();
		m.markss();
		
	}

}
