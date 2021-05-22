package com.sanchi.tutorial.algorithms;

import java.util.Arrays;

/**
 * Class to perform interpolation search.
 * 
 * @author Sanchi
 *
 */
public class FindByInterpolationSearch {

	public static void main(String[] args) {
		int[] array = {5,6,1,2,4,9,8,10};
		FindByInterpolationSearch search = new FindByInterpolationSearch();
		System.out.println("Found - "+2+" is "+search.contains(array, 2));
		System.out.println("Found - "+5+" is "+search.contains(array, 5));
		System.out.println("Found - "+7+" is "+search.contains(array, 7));
		System.out.println("Found - "+11+" is "+search.contains(array, 11));
		System.out.println("Found - "+13+" is "+search.contains(array, 13));

	}
	
	/**
	 * Method to search using binary search algorithm.
	 * Binary search has time complexity of O(log n)
	 * 
	 * @param elements
	 * @param element
	 * @return
	 */
	public boolean contains(int[] elements, int element)
	{
		if(elements == null || elements.length<1)
		{
			return false;
		}
		
		/*
		 * Interpolation search can be performed on only 
		 * sorted array.
		 */
		Arrays.sort(elements);
		
		int start = 0;
		int end = elements.length -1;
		
		while(start<end)
		{
			int mid = start + ((end-start)/(elements[end]-elements[start]))*(element - elements[start]);

			if(elements[mid] == element)
			{
				return true;
			}
			else if(elements[mid]> element)
			{
				// move to the left half
				end = mid -1;
			}
			else
			{
				// move to the right half
				start = mid+1;
			}
		}
		
		return false;
	}
}
