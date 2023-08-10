package oops;

class EncapsulationDemo
{
	private String name ="Swathi";
	public String getname()
	{
		
		return name;
		
	}
	public void setname(String name)
	{
		
		this.name=name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setname("Jyothi");
		
		System.out.println(ed.getname());
		

	}

}
