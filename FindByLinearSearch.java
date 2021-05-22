package com.sanchi.tutorial.algorithms;

import java.util.Comparator;

/**
 * Class to search an element in an array
 * by using linear search algorithm.
 * 
 * @author Sanchi
 *
 * @param <TYPE>
 */
public class FindByLinearSearch<TYPE> {

	public static void main(String[] args) {
		
	}
	
	/**
	 * Method to find and element in an array.
	 * 
	 * @param elements
	 * @param element
	 * @return
	 */
	public boolean contains(TYPE[] elements, TYPE element)
	{
		if(elements == null || elements.length<1)
		{
			return false;
		}
		
		/*
		 * This is the worst time search and take O(n) 
		 * to complete the job. Binary search and hash
		 * tables are much better in performance.
		 */
		for(TYPE ele: elements)
		{
			if(ele.equals(element))
			{
				// if match found return true.
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Method to find and element in an array.
	 * 
	 * @param elements
	 * @param element
	 * @param comparator
	 * @return
	 */
	public boolean contains(TYPE[] elements, TYPE element, Comparator<TYPE> comparator)
	{
		if(elements == null || elements.length<1)
		{
			return false;
		}
		
		/*
		 * This is the worst time search and take O(n) 
		 * to complete the job. Binary search and hash
		 * tables are much better in performance.
		 */
		for(TYPE ele: elements)
		{
			if(comparator.compare(ele, element) == 0)
			{
				// if match found return true.
				return true;
			}
		}
		
		return false;
	}
}
