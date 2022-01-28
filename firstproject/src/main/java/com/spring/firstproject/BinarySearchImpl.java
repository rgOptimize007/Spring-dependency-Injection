package com.spring.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired  //It checks for available bean and assign it to following variable (wire-in dependency)
	private SortAlgoInt sortObject;
//	public BinarySearchImpl(SortAlgoInt sortObject) {
//		this.sortObject = sortObject;
//	}
	public boolean binarySearch(int[] arrToSort, int element) {
		
		//tight coupling (Everytime you create object of class you want to call)
		// due to this whenever you want to switch to different functionality you need to make
		// changes and it comes at the cost of re-booting your whole application
		// hence its a costly approach.
		//BubbleSort bubbleSort = new BubbleSort();
	    //QuickSort quickSort = new QuickSort();
				
		int result[] = sortObject.sort(arrToSort);
				
		// search for element using binary search in result array now and return the result
		
		return false;
	}

}
