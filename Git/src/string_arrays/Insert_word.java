package string_arrays;
import java.util.Scanner;
public class Insert_word {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sentenance");
		String str1 = sc.nextLine();
	  char arr1[]= str1.toCharArray();
	  System.out.println("Enter After which word you want to insert ");
	  String str2 = sc.nextLine();
	  char arr2[]= str2.toCharArray();
	  System.out.println("Enter the new word");
	  String str3 = sc.nextLine();
	  char arr3[]= str3.toCharArray();
	  
	  int index=0;
	  int count=0;
	  for(int i=0;i<arr1.length;i++)
	  {
		  index=0;
		  count=0;
		  for(int j=0;j<arr2.length;j++)
		  {
			  if(arr2[j]==arr1[i+j])
			  {
				  index=i;
				  count++;
			  }
			  else
			  {
				  break;
			  }
			  
		  }
		  if(count==arr2.length)
		  {
			  break;
		  }
	  }
		  index=index+count+1;
		  for(int j=0;j<arr3.length+1 ;j++)
		  {
			  for(int i=0;i<arr1.length-index;i++)
			  {
				  arr1[(arr1.length-1)-i]=arr1[(arr1.length-2)-i];
			  }
		  }
		  for(int i=index;i<arr1.length;i++)
		  {
			  for(int j=0;j<arr3.length;j++)
			  {
			  arr1[i+j]=arr3[j];
			  }
		  
		  break;
	  }
	
       System.out.println("The final result is:");
       for(int k=0;k<arr1.length;k++)
       {
    	   System.out.print(arr1[k]);
       }

	}

}
