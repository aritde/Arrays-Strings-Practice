package arraysandstrings;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueUsingStacks {

	public static void main(String[] args)
	{
		int option,n,i,dequeued_element;
		Scanner input = new Scanner(System.in);
		Stack<Integer> s1= new Stack<Integer>();
		Stack<Integer> s2= new Stack<Integer>();
		//Queue<Integer> q1= new LinkedList<Integer>();
		System.out.println("Enter whether you want to perform 1. Enqueue or 2.Dequeue :");
		option = input.nextInt();
		if (option == 1)
		{
			System.out.println("Enter the value you want to push :");
		    n = input.nextInt();
		    s1.push(n);
		    System.out.println("Cuurent stack:");
		    while (s1.isEmpty())
		    	System.out.print(s1.peek() +" ,");
		}
		else if(option ==2)
		{
			if (!s1.isEmpty())
			{
				for(i=s1.indexOf(s1.peek());i>0;i--)
				{
					s2.push(s1.pop());
				}
				System.out.println("Dequeued Element is : " + s1.pop());
				for (i=s2.indexOf(s2.peek());i>=0;i--)
				{
					s1.push(s2.pop());
				}
			while (s1.isEmpty())
			    	System.out.print(s1.peek() +" ,");
			}
			else
			{
				System.out.println("No elements to dequeue");
			}
		}
		else
		{
			System.out.println("Wrong choice!!!");
		}
		
	}
}
