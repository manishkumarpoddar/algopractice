package com.algo.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 
 * @author MANISH.KUMAR.PODDAR
 *
 */
public class ArrayUtils {
	public static String printPrimitive(int numbers[])
	{
		return Arrays.stream(numbers)
			      .boxed()
			      .map(String::valueOf)
			      .collect(Collectors.joining(",", "[", "]"));
	}
	
	public static String printObject(Object[] numbers)
	{
		
		return Arrays.stream(numbers)
				      .map(String::valueOf)
				      .collect(Collectors.joining(",", "[", "]"));
	}
}
