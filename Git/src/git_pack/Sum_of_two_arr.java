package git_pack;
import java.util.Scanner;
public class Sum_of_two_arr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of the 1st array");
		int length1= sc.nextInt();
		int add;int count=0;
		int ar1[]=new int[length1];
		System.out.println("Enter the length of the 2nd array");
		int length2= sc.nextInt();
		int ar2[]=new int[length2];
		//int ar3[] = new int [length1+length2];
		if(length1==length2)
		{
			System.out.println("Array length is equal");
		
		System.out.println("Enter the elements of the 1st array");
		for(int i=0;i<length1;i++)
		{
		   ar1[i]= sc.nextInt();
		
		}
		System.out.println("Enter the elements of the 2nd array");
        for(int i=0;i<length2;i++)
         {
        	 ar2[i]=sc.nextInt();
         }
        
      
      int sum[]=new  int[ar2.length];
      System.out.println("sum of the two arrays are: ");
      for(int i=0;i<ar1.length;i++)
      {
    	  sum[i]=(ar1[i]+ar2[i]);
      }
      for(int i=0;i<length1;i++)
      {
    	  System.out.print(sum[i]+" ");
      }
        
        }
		else
		{
			System.out.println("Array length  is not equal");
		}


	}


}
