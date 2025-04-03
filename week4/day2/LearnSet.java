package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName = "google";
		Set<Character> unique = new LinkedHashSet<Character>();
		char[] charArray = companyName.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			boolean uniqueChar = unique.add(charArray[i]);
		}
		System.out.println(unique);

	}

}
