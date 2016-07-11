package arraysandstrings;

public class compress_string {
	public static void main(String[] args)
	{
		String s="aabbbcdd";
		char[] str=s.toCharArray();
		char[] str_new=new char[20];
		int len =s.length();int c;char k;
		System.out.println (len);
		int i=0,j=0;
		while (i <len)
		{
			c = 1;
			k=str[i];
			if (str [i+1] == k)
			{
				while(str[i++]==k)
				{
					c++;
				}
				str_new[j]=k;
				str_new[++j]=Character.forDigit(c, 10);
				System.out.println(str_new[j]);
				System.out.println(str_new[++j]);
				j++;
			}
			else
			{
				str_new[j]=k;
				str_new[++j]=Character.forDigit(c, 10);
				j++;
			}
		}
		if (str_new.length > len)
		{
			System.out.println(s);
		}
			else
			{
				for (i=0;i<str_new.length;i++)
				{
					System.out.print(str_new[i]);
				}
			}
	}
}