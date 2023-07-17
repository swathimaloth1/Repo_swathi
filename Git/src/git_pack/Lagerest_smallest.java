package git_pack;
import java.util.Scanner;
public class Lagerest_smallest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = sc.nextInt();
		int arr[]=new int [length];
				System.out.println("Enter the elements of the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0;i<length;i++)
		{
			if (arr[i]>largest)
		{
				largest=arr[i];
		}
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
			
		}
		System.out.println("The lergest element  is: "+largest+"  And smallest element is: "+smallest);

	}


}
