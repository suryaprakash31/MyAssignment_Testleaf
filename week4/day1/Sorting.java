package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> companies = new ArrayList<String>();
		List<String> reversedList = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			companies.add(arr[i]);
			
		}
		System.out.println("Company list"+ companies);
		Collections.sort(companies);
		System.out.println("Sorted array" + companies);
		
		int size = companies.size();
		for (int i = size-1; i >= 0; i--) {
			reversedList.add(companies.get(i));
		}
		System.out.println(reversedList);
		

	}

}
