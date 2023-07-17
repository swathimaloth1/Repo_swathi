package git_pack;
import java.util.Scanner;
public class palindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = sc.nextInt();
		int arr[]=new int [length];
				System.out.println("Enter the elements of the array");
		for(int i=0;i<length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		boolean val=true;
		for(int i=0;i<length;i++)
		{
			if(arr[i]!=arr[length-i-1])
			{
				 val = false;
				break;
			}
		}
		if(val==true)
		{
			System.out.println("The given array is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		}
		

}
