/* WAP to rotate an array of n integers by K positions*/
/* Eg : 1 2 3 4 5 6 7
 * Rotated by 2 : 3 4 5 6 7 1 2 
 */
  package arraysandstrings;
 

import java.util.Scanner;
public class RotateArrayByN {
	public static int[] reverse(int[] arr,int start,int end)
	{
		for (int i=start,j=end-1;i<(end+start)/2;i++,j--)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		return arr;
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int noOfElements;
		System.out.println("Enter the number of elements you want in the array");
		noOfElements=input.nextInt();
		int[] arr=new int[noOfElements];
		for (int i=0;i<noOfElements;i++)
		{
			arr[i]=input.nextInt();
		}
		System.out.println("Enter the number of times you want to rotate");
		int rotateBy=input.nextInt();
		arr=reverse(arr,0,rotateBy);
		arr=reverse(arr,rotateBy+1,arr.length);
		arr=reverse(arr,0,arr.length);
	
	for (int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
}
