package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int arr1[] = {1, 4, 3, 2, 8, 6, 7};
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			int num = i+1;
			if(num!= arr1[i]) {
				System.out.println(num);
				break;
			}
		}

	}

}
