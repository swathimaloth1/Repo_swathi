package string_arrays;
import java.util.Scanner;
public class Char_position {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		char arr[]= str.toCharArray();
		System.out.println("Enter the character");
		char c= sc.next().charAt(0);
		int position=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==c)
			{
				position=i;
				break;
			}
		}
		System.out.println("The character is found at position : "+position);
	}

}
