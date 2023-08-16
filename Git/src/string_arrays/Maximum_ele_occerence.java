package string_arrays;

import java.util.Scanner;

public class Maximum_ele_occerence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = sc.nextInt();
		int arr[]=new int[length];
		int count1=0;
		int count2=0;
		int count=0; 
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=sc.nextInt();
		}
      for(int i=0;i<arr.length;i++)
      {
    	  count=0;
    	  for(int j=i+1;j<arr.length;j++)
    	  {
    		  if(arr[i]==arr[j])
    		  {
    			  count++;
    		  }
    	  }
    	  if(count>count1)
    	  {
    		  count1=count;
    	  }
    	  System.out.println(arr[i]+ " "); 
    	  
      }
      for(int i=0;i<arr.length;i++)
      {
    	  count2=0;
    	  for(int j=i+1;j<arr.length;j++)
    	  {
    		  if(arr[i]==arr[j])
    		  {
    			  count2++;
    		  }
    	  }
    	  if(count1==count2)
    	  {
    		 System.out.println(arr[i]+ " "); 
    	  }
     
	}

	}
}
