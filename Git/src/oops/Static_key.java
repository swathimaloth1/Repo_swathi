package oops;

class student_details{
static String schoolname="newvidhya vihar";
	 String studentname;
	 int rollno;
	
	 student_details(String sn,int r){
		
		
		studentname=sn;
		rollno=r;
		
		
}
  void student_details1() {

	System.out.println(studentname+" "+rollno+" "+schoolname);

}
  static void change() {
	 // schoolname="ztoh";
  }
	
}


public class Static_key {
	public static void main(String[] args) {
		student_details.change();
	
		 student_details s=new  student_details("swathi",404);
		 student_details s1=new  student_details("jyothi",304);
			s.student_details1();
			s1.student_details1();
		
	
	}

}
