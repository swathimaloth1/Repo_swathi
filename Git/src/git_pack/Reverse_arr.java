package git_pack;
import java.util.Scanner;
public class Reverse_arr {
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
		System.out.println("The reverse elements are: ");
		int temp;
		for(int i=0;i<length;i++)
		{
			for (int j=i+1;j<length;j++)
			{

				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
			System.out.print(arr[i]+" ");
		}

	}

}
