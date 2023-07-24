package string_arrays;
import java.util.Scanner;

public class Print_dup_char {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		char arr[]= str.toCharArray();
		
		System.out.println("The duplicate letters are");
		
		int count;
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) 
			    {
				count++;
			
		    for(int k=i-1;k>=0;k--)
		    {
		    	if(arr[i]==arr[k])
		    	{
		    		count--;
		    	}
		    }
		   }
		}
		if(count>1)
		{
		
		System.out.print(arr[i]);
		}
		
		}
	}

}
