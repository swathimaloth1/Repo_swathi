package git_pack;

import java.util.Scanner;
public class Remove_last_ele {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n= sc.nextInt();
		 int arr[]=new int [n];
	    System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			arr[n-1-i]=arr[n-2-i];
		}
          System.out.println("After removing the last index is");
          for(int i=0;i<n-1;i++)
          {
        	  System.out.print(arr[i]+" ");
          }

}
}
