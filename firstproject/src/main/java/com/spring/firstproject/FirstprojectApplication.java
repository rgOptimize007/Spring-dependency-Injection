package com.spring.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {
		
		//traditional approach
		//BinarySearchImpl sortAlgo = new BinarySearchImpl(); // then call method for search using obj.
				
		//loose coupling (object creation and assignment) 
		//BinarySearchImpl sortAlgo = new BinarySearchImpl(new QuickSort());
		// similarly you can change the input parameter in above declaration
		// to BubbleSort to call out bubble sort algorithm.
				
	    //using dependency injection
		ApplicationContext context = SpringApplication.run(FirstprojectApplication.class, args);
		BinarySearchImpl sortAlgo = context.getBean(BinarySearchImpl.class);
		boolean result = sortAlgo.binarySearch(new int[]{1,2,3,4} , 5);
		System.out.print("Answer : " + result);

		//System.out.print("Hello World!!"); 
		
		//Note : Check for any Red markers and delete them. Will not affect your execution
	}

}
