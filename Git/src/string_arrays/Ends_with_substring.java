package string_arrays;
import java.util.Scanner;
public class Ends_with_substring {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the sentence");
	String str=sc.nextLine();
	char arr[]= str.toCharArray();
	
	System.out.println("Enter the sub string");
	String str1=sc.nextLine();
	char arr1[]= str1.toCharArray();
	int count=0;
	for(int i=0;i<=arr1.length-1;i++)
	{
		if(arr1[(arr1.length-1)-i]==arr[(arr.length-1)-i])
		{
			count++;
		}
	}
	if(count==arr1.length)
	{
		System.out.println("ends with sub string");
	}
	else
	{
		System.out.println("not ends with substring");
	}
}

}
