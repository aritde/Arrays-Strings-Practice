package arraysandstrings;

import java.util.Scanner;

public class fibonacci {
	public static int fibo(int n)
	{
		if( n==0 || n==1 )
			return 1;
		int a=1,b=1,i=2;
		int result = 0;
		while(i<(n+1))
		{
			result=a+b;
			b=a;
			a=result;
			i++;
		}
		return result;
	}
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		System.out.println(fibo(n));
	}
}
