package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			list.add(arr1[i]);
		}

		Collections.sort(list);
		System.out.println("The sorted list is " + list);
		
		int findSecond = list.size()-2;
		int secondLargest = list.get(findSecond);
		System.out.println("The Second Largest value in the list is: " + secondLargest);
	}

}
