package string_arrays;
import java.util.Scanner;
public class Count_repeated_words {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sentenance");
		String str1 = sc.nextLine();
	  char arr1[]= str1.toCharArray();
	  System.out.println("Enter the word");
	  String str2 = sc.nextLine();
	  char arr2[]= str2.toCharArray();
	  int count=0;
	  int count1=0;
	  for(int i=0;i<arr1.length-1;i++)
	  {
		  count=0;
		  
	 for(int j=0;j<arr2.length;j++)
	  {
		  if(arr1[i+j]==arr2[j])
		  {
			  count++;
		  }
		  else
		  {
			  break;
		  }
		  
		  }
	  if(count==arr2.length)
	  {
		  count1++;
	  }
	  }
	  System.out.println("The total count is: "+count1);
	}

}
