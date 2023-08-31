package string_arrays;

import java.util.Scanner;

public class Reverse_word_by_word {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sentenance");
		String str = sc.nextLine();
		char arr[]=str.toCharArray();
		String str1="";
		for(int i=arr.length-1;i>=0;i--)
		{
			str1=str1+arr[i];
		}
		
		//String str2[]=str1.split(" ");
		//for(int i=str2.length-1;i>0;i--)
		//{
		//	System.out.print(str2[i]+" ");
		//}
		
		//System.out.println(str1);
		char arr1[]=str1.toCharArray();
		int count=1;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==' ')
			{
				count++;
			}
		}
		
		String arr2[] = new String[count];
		int index=0;
		String temp="";
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==' ')
			{
				index++;
				temp="";
			}
			else
			{
				temp=temp+arr1[i];
				arr2[index]=temp;
			}
		}
		System.out.println("The final output is: ");
		for(int i=arr2.length-1;i>=0;i--)
		{
			System.out.print(arr2[i]+" ");
			
		}

	}

	}


