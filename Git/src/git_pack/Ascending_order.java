package git_pack;
import java.util.Scanner;
public class Ascending_order {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of the array is:");
		int n= sc.nextInt();
		int temp;
	    int arr[]=new int [n];
	    System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++)
			{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
		
		System.out.println("the larget number is: "+arr[arr.length-1]);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		
	}

}
