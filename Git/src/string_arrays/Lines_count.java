package string_arrays;
import java.util.Scanner;
public class Lines_count {
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str="hi\nhello\swathi\n";
		//String str= sc.nextLine();
		char arr[]= str.toCharArray();
		int count=0;
		System.out.println("lines count is: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==('\n'))
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
