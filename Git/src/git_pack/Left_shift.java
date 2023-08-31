package git_pack;
import java.util.Scanner;
public class Left_shift {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = sc.nextInt();
		int arr[]=new int [length];
		
		System.out.println("Enter the elements of the array ");
		for(int i=0;i<length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int frist=arr[0];
		for(int i=0;i<length-1;i++)
		{
			arr[i]=arr[i+1];
		}
			arr[arr.length-1]=frist;
		
			System.out.println("array after left rotation");
			for(int i=0;i<length;i++)
			{
				System.out.print(arr[i]+" ");
			}
		
			 
		}

}
