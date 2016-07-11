/* Program to remove specified elements from a string
 * O(m+n)
*/
package arraysandstrings;

import java.util.Scanner;

public class removeSpecificElement {
	public static String remove (String str, String tobeRemoved)
	{
		char[] rcvdString = str.toCharArray();
		char[] toRemove = tobeRemoved.toCharArray();
		int source = 0,dest = 0;
		boolean[] markers = new boolean[128]; // Size set to 128 as the complete ASCII set contains 128 characters.
		for ( int i=0;i<toRemove.length;i++)
		{
			markers[toRemove[i]]=true;
		}
		for (int i=0;i<rcvdString.length;i++)
		{
			if(markers[rcvdString[i]]== false)
				rcvdString[dest++]=rcvdString[i];
		}
		return String.valueOf(rcvdString,0,dest); // Note the charArray to Str conversion. Also, note how the dest has been passed to restrict the string till dest.
	}
	public static void main(String[] args)
	{
		String str= "";
		String rem = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string =");
		str = input.nextLine();
		System.out.println("Enter the characters you want removed");
		rem = input.nextLine();
		System.out.println("Original String : " + str);
		System.out.println("Characters to be removed :" + rem);
		str = remove(str,rem);
		System.out.println("Modified String : " + str);
	}

}
