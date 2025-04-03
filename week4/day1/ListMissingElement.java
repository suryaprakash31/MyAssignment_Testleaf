package week4.day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListMissingElement {

	public static void main(String[] args) {
		int []arr = {1,2,3,4,10,6,8};
		List <Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		System.out.println(list);
		
		for (int i = 0; i < (list.size()-1); i++) {
			
			int currentValue = list.get(i);
			int nextValue = list.get(i+1);
			if(nextValue != currentValue+1) {
				System.out.println("The Missing Values are: " + (currentValue+1));
				
			}
			
			
		}

	}

}
