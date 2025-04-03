package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListIntersection {

	public static void main(String[] args) {
		
		int arr1[] = {3,2,11,4,6,7};
		int arr2[] = {1,2,8,4,9,7};
		List <Integer> list1 = new ArrayList <Integer>();
		List <Integer> list2 = new ArrayList <Integer>();
		
		for (int i = 0; i < arr1.length; i++) {
			list1.add(arr1[i]);
		}
		
		for (int i = 0; i < arr2.length; i++) {
			list2.add(arr2[i]);
			
		}
		Collections.sort(list1);
		Collections.sort(list2);
		
		for (Integer each : list1) {
			if(list2.contains(each)) {
				System.out.println("The Intersection values are: " + each);
		}
			
		}

	}

}
