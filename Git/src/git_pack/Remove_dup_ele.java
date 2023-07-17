package git_pack;
import java.util.Scanner;
public class Remove_dup_ele {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = sc.nextInt();
		int arr[]=new int [length];
		
		System.out.println("Enter the elements of the array");
		for(int i=0;i<length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<length;i++)
		{
			count=0;
			for(int j=i;j<length;j++)
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
		if(count>0)
		{
			System.out.println(arr[i]);
			
		}

	}
	}
}
