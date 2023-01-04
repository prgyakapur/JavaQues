package javaBasics;

import java.util.*;
import java.util.Map.Entry;

public class leet_code_prac_Arrays {
	
public static void main(String[] args) {
		
		
	leet_code_prac_Arrays obj = new leet_code_prac_Arrays();
		
		int arr1[] = {4,3,2,7,9};
		
//		int[] ans = obj.plusOne(arr);
//		for(int ele: ans)
//			System.out.print(ele+" ");

	
		List<Integer> list = obj.findDisappearedNumbers(arr1);
		for(int ele: list)
		{
			System.out.println(ele+" ");
		}
		
	}
	
	
// ***************************** Given an array of integers nums and an integer target, 
// ****************************** return indices of the two numbers such that they add up to target.
// ****************************** You may assume that each input would have exactly one solution, 
// ****************************** and you may not use the same element twice.
// ****************************** Input: 7,2,13,11,8 -- Target = 18

	
	
	
	int[] twoSum(int[] arr, int target) 
	{
        
        int size = arr.length;
        int[] index_arr = new int[2];
        for(int i = 0; i < size; i++)
        {
            for(int j = i+1; j < size; j++)
            {
                if(arr[i]+arr[j] == target)
                {
                    index_arr[0] = i;
                	index_arr[1] = j;
                	break;
                }	
                
            }
            
        }
        return index_arr;
    }
	
	
	
	
	
// ***************** Above Question using Hash Map *************************
// ***************** Input: 7,2,13,11,8 -- Target = 18

	
	
	int[] two_Sum_Using_Hash(int arr[], int target)
	{
		int size = arr.length;
		int ans = 0;
        
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < size; i++)
		{
			ans = target - arr[i];
			if(map.containsKey(ans))
			{
				int[] index_arr = {map.get(ans),i};
				return index_arr;
			}
			map.put(arr[i], i);
		}
		return null;
		
		
	}
	
	
// ************************** Given an integer array 'arr' and an integer 'val', 
// ************************** remove all occurrences of val in nums in-place. 
// ************************** The relative order of the elements may be changed.

		
		
		
	int remmove_dup(int arr[], int val)
	{
		{
			int i = 0;
			int size = arr.length;
			for(int j = 0; j < size; j++)
			{
				if(arr[j] != val) 
				{
					arr[i] = arr[j];
					i++;
				}
			}
			return i;
		}
	}








// **************************** You are given a 0-indexed integer array arr. 
// **************************** You are also given an integer key, which is present in arr.
// **************************** For every unique integer target in arr, 
// **************************** count the number of times target immediately follows an occurrence of key in arr. 
// **************************** In other words, count the number of indices i such that:

// EXAMPLE

//Input: nums = [1,100,200,1,100], key = 1
//Output: 100
//Explanation: For target = 100, there are 2 occurrences at indices 1 and 4 which follow an occurrence of key.
//No other integers follow an occurrence of key, so we return 100.




	int mostFrequent(int[] arr, int key) 
	{
    
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    
	    int size = arr.length;
	    
	    
	    for(int i = 0; i < size-1; i++)
	    {
	    	if(arr[i] == key)
	    	{
	    		System.out.println();
	    		System.out.print(map.put(arr[i+1], map.getOrDefault(arr[i+1], 0)+1));
	    	}
	    }
	    
	    int max_count = 0;
	    int ans = 0;
	    
	    for(Map.Entry<Integer, Integer> val: map.entrySet())
	    {
	    	 if(val.getValue() > max_count) 
	    	 {
	    		max_count = val.getValue();
	    		ans = val.getKey();
	    	 }
	    }
	    return ans;
    
  
	}



// **************************** Given an array arr. We define a running sum of an array as 
// **************************** runningSum[i] = sum(arr[0]…arr[i]).
// **************************** Return the running sum of arr.



//	Example:
//
//	Input: arr = [1,2,3,4]
//	Output: [1,3,6,10]
//	Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

	
	
	int[] runningSum(int[] arr) 
	{
		 
        int[] arr_new = new int[arr.length];
        arr_new[0] = arr[0];
        
        for(int i = 1; i < arr.length; i++)
        {    
            arr_new[i] = arr_new[i-1]+arr[i];
        }
        return arr_new;
    }
	

	
	
	
// ******************************** You are given a large integer represented as an integer array digits, 
// ******************************** where each digits[i] is the ith digit of the integer. 
// ******************************** The digits are ordered from most significant to least significant in left-to-right order. 
// ******************************** The large integer does not contain any leading 0's.
// ******************************** Increment the large integer by one and return the resulting array of digits.	
	

//	Example :
//
//		Input: digits = [1,2,3]
//		Output: [1,2,4]
//		Explanation: The array represents the integer 123.
//		Incrementing by one gives 123 + 1 = 124.
//		Thus, the result should be [1,2,4].
	
	
	
	int[] plusOne(int[] digits) 
	{
		
		
		for(int i = digits.length-1; i >=0; i--)
		{
			if(digits[i] < 9)
			{
				digits[i] = digits[i]+1;
				return digits;
			}
			
			else
			{
				digits[i] = 0;
			}
			
		}
		
		int[] arr = new int[digits.length + 1];
		arr[0] = 1;
		return arr;
        
        
        
    }
	
	
	
	
// ******************************* You are given an array prices where prices[i] is the price of a given stock on the ith day.	
	
// ******************************* You want to maximize your profit by choosing a single day to buy one stock 
// ******************************* and choosing a different day in the future to sell that stock.	
	
// ******************************* Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.	
	// O(n2) time complexity
	
//	Example:
//
//		Input: prices = [7,1,5,3,6,4]
//		Output: 5
//		Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//		Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.	
	
	
	
	
	int stock(int[] arr)
	{
		int max_profit = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[j] - arr[i] > max_profit)
				{
					max_profit = arr[j] - arr[i];
				}
			}
		}
		return max_profit;
	}

	
	
	
	
	
// ******************************** Above Question, better complexity
	
	
	
	int stock_better(int[] arr)
	{
		int buy = Integer.MAX_VALUE;
		int profit = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++)
		{
			buy = Math.min(arr[i], buy);
			profit = Math.max(arr[i] - buy, profit);
		}
		
		return profit;
	}

	
	
	
	
	
// ******************************* 	Given an integer array nums, return true if any value appears at least twice in the array, 
// *******************************	and return false if every element is distinct.
//	Example:
//
//		Input: nums = [1,2,3,1]
//		Output: true
	
	boolean containsDuplicate(int[] arr) 
	{
        
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++)
        {
            if(set.contains(arr[i]))
            {
                return true;
            }
            else
                set.add(arr[i]);
        }
        
        return false;

    }

	
	
	
// ******************************* Given a non-empty array of integers nums, every element appears twice except for one. 
// ******************************* Find that single one.

// ******************************* You must implement a solution with a linear runtime complexity 
// ******************************* and use only constant extra space.
	
	
//	Example:
//
//		Input: nums = [2,2,1] 
//		Output: 1

	
	int singleNumber(int[] arr) 
    {
        
	     HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        int ans = 0;
	      
	        
	        
	        
	        for(int i = 0; i < arr.length; i++)
	        {
	            if(map.containsKey(arr[i]))
	            	map.put(arr[i],map.get(arr[i])+1); 
	              
	            else
	            	map.put(arr[i],1);
	              
	        }
	        
	        for(Integer key: map.keySet())
	        {
	            if (map.get(key) == 1)
	                ans = key;
	        }
	    
    return ans;
	
	
	
	
    }
	

	
// ******************************* Given an array nums containing n distinct numbers in the range [0, n], return 
// ******************************* the only number in the range that is missing from the array.
	
//	Input: nums = [3,0,1]
//			Output: 2
//			Explanation: n = 3 since there are 3 numbers, 
//			so all numbers are in the range [0,3]. 
//			2 is the missing number in the range since 
//			it does not appear in nums.	
	
	
	
	int missingNumber(int[] arr) 
	{
        
        int sum = 0;
        int total = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        
        for(int i = 1; i < arr.length+1; i++)
        {
            total += i;
        }
        
        return total - sum;
    }
	
	

	
	
// ******************************** Given two integer arrays nums1 and nums2, return an array of their intersection. 
// ********************************	Each element in the result must appear as many times as it shows in both arrays and 
// ******************************** you may return the result in any order.
	

//	Input: arr1 = [4,9,5], arr2 = [9,4,9,8,4]
//			Output: [4,9]
//			Explanation: [9,4] is also accepted
	
	
	
	
	void intersect(int[] arr1, int[] arr2) 
    {
		HashMap<Integer, Integer> map = new HashMap<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        
        for(int i = 0; i < arr1.length; i++)
        {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
        }
        
        for(int j = 0; j < arr2.length; j++)
        {
        	if(map.containsKey(arr2[j]))
        	{
        		ans.add(arr2[j]);
        		map.put(arr2[j], map.get(arr2[j]) - 1);
        		
        		int index = map.get(arr2[j]);
        		if(index <= 0)
        		{
        			map.remove(arr2[j]);
        		}
        		
        	}
        		
        }
		
        System.out.println(ans);
       
	   
    }

	
// ********************************* An integer array original is transformed into a doubled array 
// ***************************** changed by appending twice the value of every element in original, 
// ******************************	and then randomly shuffling the resulting array.

//	Given an array changed, return original if changed is a doubled array. 
//	If changed is not a doubled array, return an empty array. 
//	The elements in original may be returned in any order.
	
//	Input: changed = [1,3,4,2,6,8]
//			Output: [1,3,4]
//			Explanation: One possible original array could be [1,3,4]:
//			- Twice the value of 1 is 1 * 2 = 2.
//			- Twice the value of 3 is 3 * 2 = 6.
//			- Twice the value of 4 is 4 * 2 = 8.
//			Other original arrays could be [4,3,1] or [3,1,4]
	
	
	int[] findOriginalArray(int[] changed) {
        int n=changed.length;
        if(n%2!=0)                 // if not divisible by 2 than not doubled array
            return new int[]{};
        
        int[] ans=new int[n/2];   // to store result

        Map<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<n;i++)
            map.put(changed[i],map.getOrDefault(changed[i],0)+1);   //freq
        
        Arrays.sort(changed);    // sorted because it can be in any order and 
       // will be easy to search for i as i*2 
        int k=0;
        
        for(int num:changed)
        {
            if(map.get(num)<=0)    // if present and freq<=0 means already paired like 2 with 4 so when 4 come again array continue
                continue;
            
            if(map.containsKey(2*num))
            { if(map.get(2*num)<=0)    // num*2 present but already paired
                return new int[0];
            }
            else
                return new int[0];   // not present double so return empty array
                
            ans[k++]=num;       // add to result
            map.put(num,map.get(num)-1);      // decrease freq as paired
            map.put(2*num,map.get(num*2)-1);
                
        }
        
        return ans;
	
	
	
	
	
	
	
	
	
	}





// *************** You are given two integer arrays nums and multipliers of size n and m respectively, where n >= m. The arrays are 1-indexed.

// *************** You begin with a score of 0. You want to perform exactly m operations. On the ith operation (1-indexed), you will:

// Choose one integer x from either the start or the end of the array nums.
// Add multipliers[i] * x to your score.
// Remove x from the array nums.
// Return the maximum score after performing m operations.



//Example

//Input: nums = [-5,-3,-3,-2,7,1], multipliers = [-10,-5,3,4,6]
//Output: 102
//Explanation: An optimal solution is as follows:
//- Choose from the start, [-5,-3,-3,-2,7,1], adding -5 * -10 = 50 to the score.
//- Choose from the start, [-3,-3,-2,7,1], adding -3 * -5 = 15 to the score.
//- Choose from the start, [-3,-2,7,1], adding -3 * 3 = -9 to the score.
//- Choose from the end, [-2,7,1], adding 1 * 4 = 4 to the score.
//- Choose from the end, [-2,7], adding 7 * 6 = 42 to the score. 
//The total score is 50 + 15 - 9 + 4 + 42 = 102.




	int maximumScore(int[] nums, int[] multipliers)
	{
		int[][] dp = new int[multipliers.length][multipliers.length];
		
		return help(nums, multipliers, 0,0, dp);
	}

	
	int help(int [] arr, int[] multiply, int st, int midx, int[][] dp)
	{
		
		if(midx == multiply.length)
			return 0;
		if(dp[midx][st] != 0)
			return dp[midx][st];
		
		int end = arr.length-1 - (midx - st);
		
		int op1 = (arr[st] * multiply[midx]) + help(arr,multiply,st+1,midx+1,dp);
		int op2 = (arr[end] * multiply[midx]) + help(arr,multiply,st,midx+1,dp);
		
		dp[midx][st] = Math.max(op1, op2);
		
		return dp[midx][st];
		
	}


	
//	Given two integer arrays nums1 and nums2, 
//	return an array of their intersection. 
//	Each element in the result must be unique and 
//	you may return the result in any order.
//
//			 
//
//	Example:
//
//	Input: nums1 = [1,2,2,1], nums2 = [2,2]
//	Output: [2]	
	
	int [] intersection(int[] nums1, int[] nums2) 
	{
        
        Set<Integer> set1 = new HashSet<>();
        
        for(int i = 0; i < nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
        
         Set<Integer> set2 = new HashSet<>();
        
        for(int i = 0; i < nums2.length;i++)
        {
            if(set1.contains(nums2[i]))
            {
                set2.add(nums2[i]);
            }
        }
        
        int[] arr = new int[set2.size()];
        
        int i = 0;
        for(int ele: set2)
        {
            arr[i++] = ele;
        }
        
        
        return arr;
        
    }	
	
	
	
// ************************ Given a sorted array of distinct integers and a target value, return the index if the target is found.
// ************************ If not, return the index where it would be if it were inserted in order.

//	You must write an algorithm with O(log n) runtime complexity.

//	Input: nums = [1,3,5,6], target = 4
//	Output: 2
	

	int searchInsert(int[] nums, int target) 
	{
		int ans = 0;
		if(target == nums[0]) 
			return 0;
		else if(target > nums[nums.length-1])
			return nums.length;
		
		else {
			
			for(int i = 1; i < nums.length; i++)
		       {
		           if(nums[i] == target)
		               ans = i;
		           
		           else if(nums[i-1] < target && nums[i] > target)
		               ans = i;
		           
		           
		       }
		return ans;
		}
		
    }
	
	
// Above Question can also be doe through binary search in O(logN)


// *************************** Given an array nums of n integers where nums[i] is in the range [1, n], 
// *************************** return an array of all the integers in the range [1, n] that do not appear in nums.
	
	
	
//	Example:
//
//		Input: nums = [4,3,2,7,8,2,3,1]
//		Output: [5,6]	
	
	
	List<Integer> findDisappearedNumbers(int[] nums) {
        
		int num = 1;

        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        for (int i : nums) {
            set.add(i);
            set1.add(num++);
        }
        set1.removeAll(set);
        return set1.stream().toList();    
        
    }
	
	
	
	
	
	
//	Given an integer array nums, return the most frequent even element.
//	If there is a tie, return the smallest one. If there is no such element, 
//	return -1.
	
	
	
	
//	Example:
//
//		Input: nums = [0,1,2,2,4,4,1]
//		Output: 2
//		Explanation:
//		The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
//		We return the smallest one, which is 2.
	
	int mostFrequentEven(int[] nums) {
        
	    HashMap<Integer, Integer> map = new HashMap<>();
	        
	        for(int i = 0; i < nums.length; i++)
	        {
	            if(nums[i] % 2 == 0)
	            {
	                if(map.containsKey(nums[i]))
	                {
	                	map.put(nums[i], map.get(nums[i])+1);
	                }
	                else
	                	map.put(nums[i],1);
	            }
	        }        
	    	   
	       int max = -1;
	       int max_count = Integer.MIN_VALUE;
	       
	       for(Map.Entry<Integer, Integer> ele : map.entrySet())
	       {
	    	  if(ele.getValue() > max_count)
	    	  {
	    		  max = ele.getKey();
	    		  max_count = ele.getValue();
	    	  }
	    	   
	    	  else if(ele.getValue() == max_count)
	    		  max = Math.min(max, ele.getKey());
	    	   
	    		   
	       }
	    
	        return max;
	        
	    }
	
	
	
	

	
	
//	You are given an integer array nums and an array queries where queries[i] = [vali, indexi].
//
//			For each query i, first, apply nums[indexi] = nums[indexi] + vali, then print the sum of the even values of nums.
//
//			Return an integer array answer where answer[i] is the answer to the ith query.
//
//			 
//
//			Example 1:
//
//			Input: nums = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
//			Output: [8,6,2,4]
//			Explanation: At the beginning, the array is [1,2,3,4].
//			After adding 1 to nums[0], the array is [2,2,3,4], and the sum of even values is 2 + 2 + 4 = 8.
//			After adding -3 to nums[1], the array is [2,-1,3,4], and the sum of even values is 2 + 4 = 6.
//			After adding -4 to nums[0], the array is [-2,-1,3,4], and the sum of even values is -2 + 4 = 2.
//			After adding 2 to nums[3], the array is [-2,-1,3,6], and the sum of even values is -2 + 6 = 4.
	
	
	int[] sumEvenAfterQueries(int[] nums, int[][] queries)
 {
        
	       int evenSum = 0, n = queries.length;
	        
	        for (int x : nums) 
	        {
	            if (x % 2 == 0) 
	            {
	                evenSum += x;
	            }
	        }
	        
	        
	        int[] ans = new int[n];
	        
	        for (int i = 0; i < n; i++) {
	            int val = queries[i][0], idx = queries[i][1];
	            
	            if (nums[idx] % 2 == 0) 
	            	evenSum -= nums[idx];
	            
	            nums[idx] += val;

	            if (nums[idx] % 2 == 0)
	            	evenSum += nums[idx];
	            
	            ans[i] = evenSum;
	        }
	        
	        return ans;
	
	
	}

	
	
	
	
	
//	Find the Winner of the Circular Game - Josephus problem
	
	
//     There are n friends that are playing a game. The friends are sitting in a circle and are numbered from 1 to n in clockwise order. More formally, moving clockwise from the ith friend brings you to the (i+1)th friend for 1 <= i < n, and moving clockwise from the nth friend brings you to the 1st friend.
//
//			The rules of the game are as follows:
//
//			Start at the 1st friend.
//			Count the next k friends in the clockwise direction including the friend you started at. The counting wraps around the circle and may count some friends more than once.
//			The last friend you counted leaves the circle and loses the game.
//			If there is still more than one friend in the circle, go back to step 2 starting from the friend immediately clockwise of the friend who just lost and repeat.
//			Else, the last friend in the circle wins the game.
//			Given the number of friends, n, and an integer k, return the winner of the game.
//
//			 
//
//			Example 1:
//
//
//			Input: n = 5, k = 2
//			Output: 3
//			Explanation: Here are the steps of the game:
//			1) Start at friend 1.
//			2) Count 2 friends clockwise, which are friends 1 and 2.
//			3) Friend 2 leaves the circle. Next start is friend 3.
//			4) Count 2 friends clockwise, which are friends 3 and 4.
//			5) Friend 4 leaves the circle. Next start is friend 5.
//			6) Count 2 friends clockwise, which are friends 5 and 1.
//			7) Friend 1 leaves the circle. Next start is friend 3.
//			8) Count 2 friends clockwise, which are friends 3 and 5.
//			9) Friend 5 leaves the circle. Only friend 3 is left, so they are the winner.
	
	
	
	
	
	
	
	
	
	
	
	
}


















