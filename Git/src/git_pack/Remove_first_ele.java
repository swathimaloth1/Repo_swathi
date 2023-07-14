package git_pack;
import java.util.Scanner;

public class Remove_first_ele {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of the array");
		
		int length = sc.nextInt();
		int arr[]=new int [length];
				System.out.println("Enter the elements of the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		System.out.println("After removing the array is: ");
		for(int i=0;i<length-1;i++)
		{
			System.out.print(arr[i]+" ");
			}
		}

}
