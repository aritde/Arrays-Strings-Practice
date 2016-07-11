package arraysandstrings;
/*WAP to determine unique characters in a string with and without using additional buffers.
 * Things to note : ASCII or Unicode String
 * 					Include a check if the length of string greater >256 as there are 256 unique characters
 * Alternate Approach : Boolean array of 256 positions. An attempt to inset in an already filled position would mean a duplicate.O(n) is time. O(1) is space.
 * 						Can use bitwise approach as well.
 * 						Sort the given string and check the neighbouring characters for similarity. Time : O(n log(n)). 
 * 						However, sorting might end up taking more space
 * Complexity of approach impemented below : O(n^2) in time.O(1) in space.
 */
import java.io.*;
import java.util.*;
public class uniquechar {
	public static boolean unique_char_using_add_buff(String s)
	{
		int len = s.length();
		int i=0;
		HashSet<Character> a = new HashSet<Character>();
		while(i<len)
		{
			if(a.contains(s.charAt(i)))
				return false;
			else
			{
				a.add(s.charAt(i));
				i++;
			}
		}
		return true;
	}
	public static boolean unique_without_buff(String s)
	{
		int len = s.length();
		for (int i=0;i<len-1;i++)
		{
			for (int j=i+1;j<len;j++)
			{
				if(s.charAt(i)== s.charAt(j))
					return false;
				else
					continue;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		String s = "abcde";
		String s2 = "aabcd";
		String s3 = "abcda";
		boolean sr=unique_char_using_add_buff (s);
		boolean sr1=unique_char_using_add_buff(s2);
		boolean sr2=unique_char_using_add_buff(s3);
		
		System.out.println(s + " is " + sr);
		System.out.println(s2 + " is " + sr1);
		System.out.println(s3 + " is " + sr2);
		sr=unique_without_buff (s);
		sr1=unique_without_buff(s2);
		sr2=unique_without_buff(s3);
		System.out.println(s + " is " + sr);
		System.out.println(s2 + " is " + sr1);
		System.out.println(s3 + " is " + sr2);
		
		
	}
}
