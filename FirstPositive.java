package arraysandstrings;

public class FirstPositive {
/*	public static int firstMissingPositive(int A[], int n)
	    {
	        for(int i = 0; i < n; ++ i)
	           while(A[i] > 0 && A[i] <= n && A[A[i] - 1] != A[i])
	           { int temp = A[i];
	        			A[i]= A[A[i] - 1];
	        			A[A[i] - 1]=temp;
	            	//swap(A[i], A[A[i] - 1]);
	           }
	        for(int i = 0; i < n; ++ i)
	            if(A[i] != i + 1)
	                return i + 1;
	        
	        return n + 1;
	    }
	*/
	public static int firstMissingPositive(int[] nums) {
		    int n = nums.length;
		    for(int i = 0; i < n; i++) {
		        while(nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1])
		        
		        
		        	swap(nums, i, nums[i] - 1);
		    }
		    for(int i = 0; i < n; i++)
		        if(nums[i] != i + 1)
		            return i + 1;
		    return n + 1;
		}

		private static void swap(int[] nums, int i, int j) {
		   /* nums[i] ^= nums[j];
		    nums[j] ^= nums[i];
		    nums[i] ^= nums[j];*/
			int temp=nums[i];
        	nums[i]=nums[j];
        	nums[j]=temp;
		}
public static void main(String[] args)
{
	int[] arr={7,4,-1,1};
	System.out.println(firstMissingPositive(arr));
}
}
