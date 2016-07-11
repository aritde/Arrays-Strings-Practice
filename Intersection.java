package arraysandstrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Intersection {
		public static void main(String[] args)
		{
			int[] arr1={2,2,4,8,8,8,7};
			int[] arr2={2,4,4,8,8,7};
			int[] res=intersection(arr1,arr2);
			for ( int i=0;i<res.length;i++)
				System.out.println(res[i]+ " ");
			
		}
		public static int[] intersection(int[] nums1, int[] nums2) {
			int count=0;
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        ArrayList<Integer> res=new ArrayList<Integer>();
	        for ( int i=0;i<nums1.length;i++)
	        {
	            if(map.containsKey(nums1[i]))
	            {
	                map.put(nums1[i],map.get(nums1[i])+1);
	            }
	            else
	                map.put(nums1[i],1);
	        }
	        for (int i=0;i<nums2.length;i++)
	        {
	            if(map.containsKey(nums2[i]))
	            {
	                res.add(nums2[i]);
	                if(map.get(nums2[i])>1)
	                    map.put(nums2[i],map.get(nums2[i])-1);
	                else
	                    map.remove(nums2[i]);
	            }
	        }
	        int[] result = new int[res.size()];
	        for (int i = 0; i < res.size(); i++) {
	            result[i] = res.get(i).intValue();
	        }
	        return result;
	    }
		
		//Intersection 1
/*	    public static int[] intersection(int[] nums1, int[] nums2) {
	    //Set<Integer> set = new HashSet<Integer>();
	    	
	        int count=0;
	        Map<Integer,Boolean> map = new HashMap<Integer,Boolean>();
	        for ( int i=0;i<nums1.length;i++)
	        {
	            map.put(nums1[i],false);
	        }
	        for (int i=0;i<nums2.length;i++)
	        {
	            if(map.containsKey(nums2[i]) && !map.get(nums2[i]))
	            {
	                count++;
	                map.put(nums2[i],true);
	            }
	        }
	        int[] result = new int[count];
	        
	        for (int i=0;i<nums2.length && count>0 ;i++)
	        {
	            if(map.containsKey(nums2[i])&& map.get(nums2[i]) )
	            {
	            	map.put(nums2[i],false);
	            	result[--count]=nums2[i];
	            }
	        }
	        return result;
	    }*/
	}


