package pageobjects;

import java.util.Scanner;

public class Paliandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string/number to check if it is a palindrome ks");  
		 String original, reverse = ""; // Objects of String class 
		 System.out.println("Paliandrome Program - kalai test2");
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i); 
	      System.out.println(reverse);
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");  
	}

}
