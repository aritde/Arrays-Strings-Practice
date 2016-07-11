package arraysandstrings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class noOfOddElements {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int noOfElements;
		HashSet<Integer> hs= new HashSet<Integer>();
		System.out.println("Enter the number of elements : ");
		noOfElements= input.nextInt();
		int[] arr=new int[noOfElements];
		for (int i=0;i<noOfElements;i++)
		{
			arr[i]=input.nextInt();
			if (hs.contains(arr[i]))
				hs.remove(arr[i]);
			else
				hs.add(arr[i]);
		}
		Iterator<Integer> it = hs.iterator();
	     while(it.hasNext()){
	        System.out.println(it.next());
	     }
	}

}
