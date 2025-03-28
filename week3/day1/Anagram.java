package week3.day1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		//Getting Input from the User
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the First String: ");
		String str1 = s.next();
		System.out.print("Enter the Second String: ");
		String str2 = s.next();
		
		//Converting string to lowerCase
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		//Checking the length of the 2 String
		
		if(str1.length() == str2.length()) {
			
			//Converting the String into Char Array
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			
			//Sorting the charArray
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			//check the sorted arrays are equal
			boolean equals = Arrays.equals(charArray1, charArray2);
			
			//Check the given string is AnaGram
			if(equals) {
				System.out.println("The Given Strings are Anagram");
			}
			else {
				System.out.println("The Given Strings are Anagram");
			}
			
		}
		else {
			System.out.println("The Given String length Doesnt Match. Hence the Given String is Not an Anagram");
		}

	}

}
