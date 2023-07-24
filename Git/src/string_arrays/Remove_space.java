package string_arrays;
import java.util.Scanner;
public class Remove_space {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		char arr[]= str.toCharArray();
		String result="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				result=result+arr[i];
			}
		}
		System.out.println("The string after removing the space is: "+result);

	}

}
