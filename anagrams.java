package arraysandstrings;

import java.util.Scanner;

public class anagrams 
{
	public static boolean checkAnagram(String s1, String s2)
	{
		if(s1.length() != s2.length())
			return false;
		int[] letters=new int[256];
		char[] s1_array=s1.toCharArray();
		for (char c : s1_array)
			letters[c]++;
		for (int i=0;i<s2.length();i++)
		{
			int c=(int)s2.charAt(i);
			if(--letters[c] < 0)
				return false;
		}
	return true;
}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two strings : ");
		String s1=input.nextLine();
		String s2=input.nextLine();
		System.out.println(checkAnagram(s1,s2));
	}
}
