package git_pack;

import java.util.Scanner;
public class Right_shift {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length=sc.nextInt();
		int arr[]=new int[length];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<length;i++)
		{
			arr[i]=sc.nextInt();
		}
			int temp=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--)
			{
				arr[i]=arr[i-1];
			}
		arr[0]=temp;

		System.out.println("The array after right shift is");

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
       
	}


}
