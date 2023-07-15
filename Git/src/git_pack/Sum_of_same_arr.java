package git_pack;
import java.util.Scanner;
public class Sum_of_same_arr {
	
	public static void main(String[] args) {
		
           Scanner sc = new Scanner (System.in);
           System.out.println("Enter the length of the array");
           int n=sc.nextInt();
           int sum=0;
           int arr[]= new int[n];
           System.out.println("Enter the elements of the array: ");
           for(int i=0;i<n;i++)
           {
        	   arr[i]=sc.nextInt();
        	  
        	   sum=sum+arr[i];
           }
           System.out.println("The sum of array elements are:"+sum);
	}

}
