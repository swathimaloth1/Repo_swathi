package git_pack;
import java.util.Scanner;
public class Add_ele_last_index {
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
		System.out.println("Enter a new element");
		int ele=sc.nextInt();
		for(int i=0;i<length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[length-1]=ele;
		System.out.println("The new array is: ");
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
