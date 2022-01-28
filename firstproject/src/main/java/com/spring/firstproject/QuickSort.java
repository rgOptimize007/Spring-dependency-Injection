package com.spring.firstproject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component    // to tell Spring that create bean for following class.
@Primary      //when Spring gets confuse between two beans
public class QuickSort implements SortAlgoInt {

	@Override  // important annotation as it tells compiler to run mandatory checks for override methods
	public int[] sort(int[] unsortedArr) {
		//Write complex logic to sort using Quick Sort
		int sortedArr[] = unsortedArr;
		return sortedArr;
	}
}
