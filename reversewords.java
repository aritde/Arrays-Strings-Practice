package arraysandstrings;
import java.util.Scanner;
public class reversewords {
	/*public static void reverseWord(String str)
	{
		int index = 0;
		String finalStr="";
		String intermediateStr="";
		for(index=0;index<str.length();index++)
		{
			String w="";
			char x = str.charAt(index);
			while (x!=' ')
			{
				w=w + x;
				index++;
				if (w!=" ")
				{
					intermediateStr= w+ " "+intermediateStr;
				}
			}
			//finalStr = finalStr + intermediateStr;
			System.out.println(intermediateStr);
		}
		//return finalStr;
	}*/
	public static char[] reverse(char[] arr,int start,int end)
	{
		for (int i=start,j=end-1;i<(end+start)/2;i++,j--)
		{
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		return arr;
	}
	public static String reverseWords(String s) {
	//public static char[] reverseWords(char[] str)
	//{
		String[] words = s.trim().split(" +");
		s="";
		for (int i=0;i<words.length;i++)
		{
			s = s +words[i] ;
			if(i!=words.length-1)
			    s=s + ' ';
		}
		System.out.println("Haha-" + s);
		char[] str=s.toCharArray();
		for ( int i=0;i<str.length;i++)
			System.out.print(str[i]);
		
		str=reverse(str,0,str.length);
		for ( int i=0;i<str.length;i++)
			System.out.print(str[i]);
		int i=0,j=0;
		for(i=0;i<=str.length;i++)
		{
			
			if (i==str.length)
			{
				str=reverse(str,j,i);
				break;
			}
			
			if(str[i]==' ')
			{
				str=reverse(str,j,i);
				j=i+1;
			}
		}
		return new String(str);
	}
	public static void main(String[] args)
	{
		String str= "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string :");
		str= input.nextLine();
		System.out.println("The actual String is : " + str);
		/*String[] words = str.trim().split(" +");
		str="";
		for (int i=0;i<words.length;i++)
		{
			str = str +words[i] + ' ';
			System.out.println(words[i]);
		}*/
		//str= 
		System.out.println(str);
		str = reverseWords(str);
		System.out.println("The word reversed String is : " + str);
		/*System.out.println("The word reversed String is : "); //+ reverseWord(str));
		for (int i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
		}*/
	}
}
