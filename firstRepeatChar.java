package arraysandstrings;

import java.util.HashMap;
import java.util.Scanner;

public class firstRepeatChar {
	public static String firstRepeatedCharacter (String str)
	{
		Object known;
		Object ocuuredOnce=new Object();
		Object occurredMoreThanOnce = new Object();
		HashMap<Integer, Object> hm = new HashMap<Integer,Object>();
		int length = str.length();
		for(int i=0;i<length;)
		{
			int cp = str.codePointAt(i);
			known = hm.get(cp);
			if (known == null)
			{
				hm.put(cp,ocuuredOnce);
			}
			else
			{
				if (known == ocuuredOnce);
				{
					hm.put(cp,occurredMoreThanOnce);
				}
			}
			i+=Character.charCount(cp);
			
		}
		for (int i=0;i<length;)
		{
			int cp = str.codePointAt(i);
			i+=Character.charCount(cp);
			if (hm.get(cp) == ocuuredOnce)
			{
				return new String(Character.toChars(cp));
			}
		}
		return null;
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String str="";
		System.out.println("Enter the string to be tested : ");
		str = input.nextLine();
		String result = firstRepeatedCharacter(str);
		System.out.println("First character is : " + result);
		
		
	}

}
