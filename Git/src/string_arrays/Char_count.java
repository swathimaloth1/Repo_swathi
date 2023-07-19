package string_arrays;
import java.util.Scanner;
public class Char_count {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		char arr[]= str.toCharArray();
		int count=0;
		System.out.println("The character count is: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				count++;
			}
		
		}
		System.out.println(count);
		}
	}



