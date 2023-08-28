package string_arrays;



public class String_inbuilt_methods {

	public static void main(String[] args) {
		String str = "ZTOH ITESSS INDIA PVT LTD";
		String str2 = "atoh itesss kndia pvt ltd";
		String str3 = "            Atoh itesss  jyfindia yvt ltx            ";
		
		
		System.out.println(str);            //to print the string
		System.out.println(str.length());   //to find the length of the array
		String str1="hi hello good morning";
	//	System.out.println(str+" "+str1);    //to combined the two strings
		System.out.println(str.charAt(2));   //to find the character position
		System.out.println(str.concat(str1));     //to combined the two strings
		System.out.println(str.endsWith(str2));    //string endswith  boolean
		System.out.println(str.startsWith(str1));   //string startswith boolean
		System.out.println(str.equals(str1));        //to string equals or not boolean
		System.out.println(str.repeat(3));        //repeated the string
		System.out.println(str.replace('i', 'k'));  //to replace the character 
		System.out.println(str.toLowerCase());      //converts to lowercase
		System.out.println(str3.toUpperCase());      //converts to upper case
		System.out.println(str2.replace(str2, str1));  //replace string to string
		System.out.println(str3.trim());               //trim the string
		
		
		String arr[] = str1.split(" ");                //to split the string
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+ " ");
		}
		
		System.out.println(str2.contains(str3));     //boolean//contains method is used to the string is contain the word or not
		System.out.println(str3.substring(5));       //after character to print the string
		System.out.println(str3.substring(5, 20));    //it will gives the 5th char to 20th char
		System.out.println(str3.indexOf('i'));         //it gives the index of the character
		System.out.println(str3.indent(5));            //it gives the space for the starting 
		System.out.println(str3.compareTo(str2));      //it compares the two strings and gives ASCII values
		System.out.println(str3.contentEquals(str1));   //boolean//this method verifies the two strings are equal or not
		
		System.out.println(str1.indexOf(str3));
		System.out.println(str3.stripLeading());          //to remove starting space
		System.out.println(str3.stripTrailing());         //to remove the ending space
		System.out.println(str.lastIndexOf('D'));          //it gives the last word of the index number like 23
		
	
	}

}
