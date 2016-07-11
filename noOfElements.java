/*Counts the number of occurrence of the elements in the given array*/
package arraysandstrings;

import java.util.Scanner;
import java.util.HashMap;
public class noOfElements {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		System.out.println("Enter the number of elements in the array :");
		int n = input.nextInt();
		int[] arr = new int[n];
		int temp;
		for (int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
			if (hs.containsKey(arr[i]))
			{
				temp = (int) hs.get(arr[i]);
				hs.put(arr[i],temp+1);
				
			}
			else
				hs.put(arr[i],1);
		}
		for ( Integer iterator : hs.keySet())
		{
			System.out.println("Array element :" +iterator+"Count :" + hs.get(iterator));
		}
	}

}
