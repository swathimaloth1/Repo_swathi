package string_arrays;
import java.util.Scanner;
public class Trim {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		char arr[]= str.toCharArray();
		int start =0;
		int end=arr.length-1;
		String result="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				start =i;
			
			break;
			}
		}
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=' ')
			{
				end=i;
			
			break;
		}
		}
		for(int i=start;i<=end;i++)
		{
			result=result+arr[i];
		}
		System.out.println(result);
	}
}
		
