package string_arrays;
import java.util.Scanner;
public class Remove_word {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sentenance");
		String str1 = sc.nextLine();
	  char arr1[]= str1.toCharArray();
	  System.out.println("Enter the word which you want to remove ");
	  String str2 = sc.nextLine();
	  char arr2[]= str2.toCharArray();
	   int count=0;
	   int index=0;
	  for(int i=0;i<arr1.length;i++)
	  {
		   count=0;
		  for(int j=0;j<arr2.length;j++)
			  {
				 if( arr1[i+j]==arr2[j])
				 {
					 index=i;
					 count++;
					
				 }
			  }
			  if(count==arr2.length)
			  {
				  break;
			  }
		  }
	     if(count==arr2.length)
	     {
	    	 for(int k=0;k<arr2.length;k++)
	    	 {
	    		 for(int m=index;m<arr1.length-1;m++)
	    		 {
	    			 arr1[m]=arr1[m+1];
	    		 }
	    	 }
	     }
	     for(int k=0;k<arr1.length-count;k++)
	     {
	    	 System.out.print(arr1[k]);
	     }
	  }
	  
	 

}
