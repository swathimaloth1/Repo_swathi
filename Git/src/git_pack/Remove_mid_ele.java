package git_pack;
import java.util.Scanner;

public class Remove_mid_ele {
	
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
		System.out.println("Choose 1 ele from the  the above elements and enter the element  which u want to remove");
		int data=sc.nextInt();
		for(int i=0;i<length;i++)
		{
			if(arr[i]==data)
			{
				for(int j=i;j<length-1;j++)
				{
					arr[j]=arr[j+1];
				}
			break;
		       }
		}
	 System.out.println("After removing the element the array is");
		for(int i=0;i<length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		}

}
