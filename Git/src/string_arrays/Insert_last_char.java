package string_arrays;

import java.util.Scanner;

public class Insert_last_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence ");
		String str = sc.nextLine();
		System.out.println("Enter the char");
		char c=sc.next().charAt(0);
		System.out.println(str+c);
		

	}

}
