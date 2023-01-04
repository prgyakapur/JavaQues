package javaBasics;
import java.util.*;

public class Ques_ArraysBasic {
	
	public static void main(String args[]) {

		
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the size of array: ");
//		int size = sc.nextInt();
//		System.out.println();
//		int arr[] = new int[size];
		//int flag = 1;
		
		
//		for(int i = 0; i < size; i++)
//			{
//				System.out.print("Enter the element number " + (i+1) + " in the array: ");
//				arr[i] = sc.nextInt();	
//			}
//		System.out.println();
//		System.out.println(arr.length);
		
		int arr[] = {1,2,4,7,3,5,-2,1};
		int size = arr.length;
		
		System.out.print("Input of the array: ");
		for(int ele: arr) 
		{
			System.out.print(ele+ " ");
		}
		System.out.println();
		System.out.println("Size of the array: "+size);
		System.out.println();
		System.out.println();
//		System.out.print("Enter the sum: ");
//		int three_sum = sc.nextInt();
//		boolean ans = threeSum(arr, three_sum);
//		System.out.println(ans);

		
		
		
		
		
		
		
		
		
		
//  -------- Shift all 0's to left and 1's to right -----

//		
//		System.out.print("Enter Size of the array: ");
//		int n = sc.nextInt();
//		
//		int[] arr = new int[n];
//		int count = 0;
//		
//		for (int i = 0; i < n; i++)
//		{
//			arr[i] = sc.nextInt();	
//		}
//		
//		for(int ele: arr) 
//		{
//			if(ele == 0) 
//			{
//				count++;
//			}
//		}
//		
//		System.out.print(count);
//		
//		for(int i = 0; i < count; i++) 
//		{
//			arr[i] = 0;	
//		}
//		
//		for(int i = count; i < n;i++) 
//		{
//			arr[i] = 1;
//		}
//		
//		for(int res: arr) 
//		{
//			System.out.print(res);		
//		}
			
	
		
		
		
		
		
		
// -------- Search an element in an array -----
		
		
		
//		System.out.print("Enter the number of elements in the array: ");
//		int size = sc.nextInt();
//		System.out.println();
//		int arr[] = new int[size];
//		int flag = 0;
//		
//		
//		for(int i = 0; i < size; i++)
//		{
//			System.out.print("Enter the element number " + (i+1) + " in the array: ");
//			arr[i] = sc.nextInt();	
//		}
//		System.out.println();
//		System.out.print("Enter the number you want to search: ");
//		int element = sc.nextInt();
//		
//		for(int i = 0; i < size; i++) 
//		{
//			if(element == arr[i])
//			{
//				System.out.println();
//				System.out.println("Number found at position: "+ i);
//				flag = 1;
//			}
//		}
//		if (flag == 0)
//		{
//			System.out.println();
//			System.out.println("Element not found !!!");
//		}
//		
		
		
		
		
		
		
		
// -------- Delete an element in an array -----
		
		
		
		
		
//		System.out.print("Enter the number of elements in the array: ");
//		int size = sc.nextInt();
//		System.out.println();
//		int arr[] = new int[size];
//		int flag = 0;
//		int del = 0;
		
//		for(int i = 0; i < size; i++)
//			{
//				System.out.print("Enter the element number " + (i+1) + " in the array: ");
//				arr[i] = sc.nextInt();	
//			}
//		System.out.println();
//		System.out.print("Enter the element you want to delete: ");
//		int element = sc.nextInt();
//		
//		
//		for(int i = 0; i < size; i++) 
//			{
//				if(element == arr[i])
//				{
//					del = i;
//					for (int j = i; j < size-1; j++)
//					{
//						arr[j] = arr[j+1];
//					}
//					System.out.println();
//					System.out.println("Number deleted from position: "+ (del+1));
//					flag = 1;
//				}
//			}
//			if (flag == 0)
//			{
//				System.out.println();
//				System.out.println("Element not found !!!");
//				for(int ele = 0; ele < size; ele++) 
//				{
//					System.out.print(arr[ele]+" ");
//				}
//			}
//			else 
//			{
//				System.out.println();	
//				for(int ele = 0; ele < size -1; ele++) 
//				{
//					System.out.print(arr[ele]+" ");
//				}
//			}
		
		
		
		
		
		
		
// -------- Largest element in an array -----

		

		
		
		
//		System.out.print("Enter the number of elements in the array: ");
//		int size = sc.nextInt();
//		System.out.println();
//		int arr[] = new int[size];
//		
//		
//		for(int i = 0; i < size; i++)
//			{
//				System.out.print("Enter the element number " + (i+1) + " in the array: ");
//				arr[i] = sc.nextInt();	
//			}
//		
//		int max = arr[0];
//		for(int i = 0; i < size; i++)
//			{
//				if (arr[i] > max)
//				{
//					max = arr[i];
//				}
//			}
//		System.out.println();
//		System.out.print("Max number is "+ max);	
		
		
		
		
		
		
		
		
		
		
// -------- Second largest element in an array -----------
		
		
		

//		System.out.print("Enter the number of elements in the array: ");
//		int size = sc.nextInt();
//		System.out.println();
//		int arr[] = new int[size];
//		
//		
//		for(int i = 0; i < size; i++)
//			{
//				System.out.print("Enter the element number " + (i+1) + " in the array: ");
//				arr[i] = sc.nextInt();	
//			}
//		
//		int max = arr[0];
//		for(int i = 0; i < size; i++)
//			{
//				if (arr[i] > max)
//				{
//					max = arr[i];
//				}
//			}
//		int max2 = arr[0];
//		for(int i = 0; i < size; i++)
//			{
//				if (arr[i] < max && arr[i]>max2)
//				{
//					max2 = arr[i];
//				}
//			}
//		System.out.println();
//		System.out.print("Second max number is "+ max2);	
		
		
		
		
		
		
		
		
		
		
		
		
		

// -------- Smallest element in an array -----
		
		
		
		
//		System.out.print("Enter the number of elements in the array: ");
//		int size = sc.nextInt();
//		System.out.println();
//		int arr[] = new int[size];
//		
//		
//		for(int i = 0; i < size; i++)
//			{
//				System.out.print("Enter the element number " + (i+1) + " in the array: ");
//				arr[i] = sc.nextInt();	
//			}
//		
//		int min = arr[0];
//		for(int i = 0; i < size; i++)
//			{
//				if (arr[i] < min)
//				{
//					min = arr[i];
//				}
//			}
//		System.out.println();
//		System.out.print("Min number is "+ min);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
// -------- Third largest element in an array --------
		
		
		
//		System.out.print("Enter the number of elements in the array: ");
//		int size = sc.nextInt();
//		System.out.println();
//		int arr[] = new int[size];
//		
//		
//		for(int i = 0; i < size; i++)
//			{
//				System.out.print("Enter the element number " + (i+1) + " in the array: ");
//				arr[i] = sc.nextInt();	
//			}
//		
//		int max = arr[0];
//		for(int i = 0; i < size; i++)
//			{
//				if (arr[i] > max)
//				{
//					max = arr[i];
//				}
//			}
//		int max2 = arr[0];
//		for(int i = 0; i < size; i++)
//			{
//				if (arr[i] < max && arr[i]>max2)
//				{
//					max2 = arr[i];
//				}
//			}
//		int max3 = arr[0];
//		for(int i = 0; i < size; i++)
//			{
//				if (arr[i] < max2 && arr[i]>max3)
//				{
//					max3 = arr[i];
//				}
//			}
//		System.out.println();
//		System.out.print("Third max number is "+ max3);	
		
		

		
		
		
		
		
		
		
		
// -------- Third largest element in an array (Better Approach)--------
		
		
		
		
//		SortedSet< Integer > set = new TreeSet<>();
//        
//		for ( int e : arr ) 
//			set.add(e);
//        
//		if ( set.size() == 1 ) 
//        	System.out.println(set.first());
//        else if ( set.size() == 2 ) 
//        	System.out.println(set.last());
//        
//        set.remove(set.last());
//        set.remove(set.last());
//        
//        System.out.println(set.last());
    
		
		
		
		
		
		
		
		
		
// ---------- Check if the array is sorted --------------------
		
		
//		System.out.print("Enter the number of elements in the array: ");
//		int size = sc.nextInt();
//		System.out.println();
//		int arr[] = new int[size];
//		int flag = 1;
//		
//		
//		for(int i = 0; i < size; i++)
//			{
//				System.out.print("Enter the element number " + (i+1) + " in the array: ");
//				arr[i] = sc.nextInt();	
//			}
//		System.out.println();
//		
//		for(int i = 0; i < size-1; i++)
//			{
//				if (arr[i] > arr[i+1])
//				{
//						flag = 0;
//						break;
//				}	
//			}		
//		if(flag == 0)
//		{
//			System.out.print("Array is not sorted");
//		}
//		else
//		{
//			System.out.print("Array is sorted");
//		}
		
		
			
		
		
		
// ---------- Removing duplicates in the sorted array -----------------	
		
		
//		System.out.print("Enter the number of elements in the array: ");
//		int size = sc.nextInt();
//		System.out.println();
//		int arr[] = new int[size];
//		//int flag = 1;
//		
//		
//		for(int i = 0; i < size; i++)
//			{
//				System.out.print("Enter the element number " + (i+1) + " in the array: ");
//				arr[i] = sc.nextInt();	
//			}
//		System.out.println();
//		
//		int j = 0;
//		for(int i = 0; i < size; i++)
//		{
//			if (arr[i] != arr[j]) 
//			{
//				arr[j+1] = arr[i];
//				j++;
//			}
//		}
//		
//		for(int ele = 0; ele <= j; ele++)
//		{
//			{
//				System.out.print(arr[ele]+" ");
//			}
//		}
//		
//		
//	
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
// ---------- Reverse the given array -----------------	
		
		
		
		
//		System.out.print("Enter the number of elements in the array: ");
//		int size = sc.nextInt();
//		System.out.println();
//		int arr[] = new int[size];
//		//int flag = 1;
//		
//		
//		for(int i = 0; i < size; i++)
//			{
//				System.out.print("Enter the element number " + (i+1) + " in the array: ");
//				arr[i] = sc.nextInt();	
//			}
//		System.out.println();
//		
//		
//		int j = size-1;
//		int temp = 0;
//		for(int i = 0; i < (size/2); i++) 
//		{
//			temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//			j--;
//		}
//		
//		
//		for(int ele = 0; ele <= size-1; ele++)
//			{
//				{
//					System.out.print(arr[ele]+" ");
//				}
//			}
		
		
		
		
		

		
		
		
		
//----------- Replace every element with the greatest element on its right
		
		// eg: 7 5 8 9 6 8 5 7 4 6 => 9 9 9 8 8 7 7 6 6 0
		
//		
//		System.out.print("Enter the number of elements in the array: ");
//		int size = sc.nextInt();
//		System.out.println();
//		int arr[] = new int[size];
//		//int flag = 1;
//		
//		
//		for(int i = 0; i < size; i++)
//			{
//				System.out.print("Enter the element number " + (i+1) + " in the array: ");
//				arr[i] = sc.nextInt();	
//			}
//		System.out.println();
//		
//		
//		int max = arr[0];
//		int j = 0;
//		do {
//			max = 0;
//			for(int i = j+1; i < size; i++)
//				{
//					if (arr[i] > max)
//					{
//						max = arr[i];
//					}
//				}
//		arr[j] = max;
//		j++;
//		
//		}while(j<size);
//		
//		for(int ele = 0; ele <= size-1; ele++)
//		{
//			{
//				System.out.print(arr[ele]+" ");
//			}
//		}
	
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
//----------- leaders in an array (On2) -----------
		
		
		
//
//		int curr = 0;
//		boolean flag;	
//		for(int i = 0; i < size-1; i++)
//		{
//			curr = arr[i];
//			flag = true;
//			{
//				for(int j = i + 1; j < size; j++)
//				{
//					if (arr[j] > curr) 
//					{
//						flag = false;
//						break;
//					}
//					
//				}
//			}
//			if(flag) 
//				System.out.print(arr[i]+" ");
//
//		}
//		System.out.print(arr[size-1]);
//		
		
		
		
		
	
		


		
		
		
//----------- leaders in an array (better approach) O(n)-----------

//		int largest = Integer.MIN_VALUE;
//		for(int i = arr.length - 1; i >= 0; i--)
//		{
//			if(arr[i] > largest)
//			{
//				largest = arr[i];
//				System.out.print(arr[i]+" ");
//			}
//		}
//		
//		
//		
//		
		
		
		
		
		
		

		
		
		
		
		
		
		
//------------------ Maximum Sum Sub array (kadane's Algorithm) ----------------------

//		
//		int cursum = 0;
//		int maxsum = Integer.MIN_VALUE;
//		
//		for(int i = 0; i < size; i++)
//		{
//			cursum += arr[i];
//			
//			if(cursum > maxsum)
//			{
//				maxsum = cursum;
//			}
//			if(cursum < 0)
//			{
//				cursum = 0;
//			}
//			
//		}
//		System.out.print("Max sum is = "+maxsum);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//------------------ Minimum Sum Sub array (kadane's Algorithm) ----------------------

	
//	int cursum = 0;
//	int minsum = Integer.MAX_VALUE;
//	
//	for(int i = 0; i < size; i++)
//	{
//		
//		if (cursum > 0)
//		{
//			cursum = arr[i];
//		}
//		else 
//		{
//			cursum += arr[i];
//		}
//		minsum = Math.min(minsum,cursum);
//	}
//	System.out.print("Min sum is = "+minsum);

				
		
		
		
		
		
		
		
		
		
		
		
// ------------------ Container with most Water --------------------
		

//	
//	int start = 0;
//	int end = size - 1;
//	int area = Integer.MIN_VALUE;
//	int max_area = Integer.MIN_VALUE;
//	int length = 0;
//	int breadth = 0;
//	
//	for (int i = 0; i < size-1; i++)
//	{
//		breadth = end - start;

//		length = Math.min(arr[start], arr[end]);
//		
//		area = length * breadth;

//		if (area > max_area)
//		{
//			max_area = area;
//		}
//		
//		
//		if (arr[start] < arr[end])
//		{
//			start++;
//		}
//		else
//		{
//			end--;
//		}
//	
//	}
////	System.out.println();
//	System.out.print("Max area is "+max_area);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
// -------------------- Trapping rain water problem O(n) --------------------
// -------------------- [0,1,0,2,1,0,1,3,2,1,2,1]
		
//		int left[] = new int[size];
//		int right[] = new int[size];
//		int capacity = 0;
//	
//		left[0] = arr[0];
//		right[size-1] = arr[size-1];
//		
//		
//		
//		for(int i = 1; i < size; i++)
//		{
//			left[i] = Math.max(arr[i],left[i-1]);
//		}
//
//		
//		for(int i = size-2; i >= 0; i--)
//		{
//			right[i] = Math.max(arr[i],right[i+1]);
//		}
//		
//		
//		for(int k = 0; k < size; k++)
//		{
//			capacity += (Math.min(left[k], right[k])) - arr[k];
//		}
//		
//		System.out.print("Capacity of water is: "+capacity+" units.");
		
		
	
	
	

		
		
		
		
		
		
		
		
		
// -------------------- Trapping rain water problem O(1) --------------------		
// -------------------- [0,1,0,2,1,0,1,3,2,1,2,1] , [4,2,3]
		
		
		
		
//		int ans = 0;
//		int left = 0;
//		int right = size-1;
//		int left_max = 0;
//		int right_max = 0;
//		
//		
//		if(arr.length == 0)
//			System.out.println("No water is trapped !!");
//		
//		while(left < right)
//		{
//			
//			if(arr[left] <= arr[right])
//			{
//				if(arr[left] > left_max)
//					left_max = arr[left];
//				else
//					ans += (left_max - arr[left]);
//				
//				left++;
//			}
//			
//			else
//			{
//				if(arr[right] > right_max)
//					right_max = arr[right];
//				else
//					ans += (right_max - arr[right]);
//				right--;
//			}
//			
//		}
//		
//		System.out.println();
//		System.out.print("The max area trapped in water is: "+ans);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
		
		

		
		
// ---------------------------- Print Freq of all the elements in a sorted Array ------------------------
		
//		
//		int freq = 1;
//		
//		
//		for(int i = 1; i < size; i++)
//		{
//			if(arr[i] == arr[i-1])
//			{
//				freq++;
//			}
//			else
//			{
//				System.out.print(arr[i-1]+": "+freq);
//				System.out.println();
//				
//				freq = 1;
//			}
//		}
//		
//		System.out.print(arr[size-1]+": "+freq);
//

		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
// ------------- In an array of all 0's and 1's, find the longest length of all consecutives 1's------------------------
// -------- INPUT: 1 1 1 0 0 1 0 1 1 1 1 0 1
// -------- OUTPUT: 4
		
		
		
//		
//
//		int count = 0;
//		int maxi = 0;
//		
//		for(int i = 0; i < size; i++)
//		{
//			if(arr[i] == 1)
//			{
//				count++;
//			}
//			
//			else 
//			{
//				count = 0;
//			}
//			maxi = Math.max(count, maxi);
//		}
//		System.out.print("Longest length of all consecutives 1's: "+maxi);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
// ------------- Move all 0's to the end of the given array -----------------------
		

//		int temp = 0;
//		
//		for(int i = 0; i < size; i++)
//		{
//			if (arr[i]!=0)
//			{
//				arr[temp] = arr[i];
//				temp++;
//			}
//		}
//		for(int j = temp;j < size; j++)
//		{
//			arr[j]= 0;
//		}
//		
//		for(int ele: arr) {
//			System.out.print(ele+" ");
//		}
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
// -------------- Print the elements in the maximum sum subarray ---------------------		
// ---------- -2 -5 6 -2 -3 1 5 -6 ------------------------	
		
	
//		int start = 0;
//		int end = 0;
//		
//		int cursum = 0;
//		int maxsum = Integer.MIN_VALUE;
//		
//		for(int i = 0; i < size; i++)
//		{
//			cursum += arr[i];
//			
//			if(cursum > maxsum)
//			{
//				maxsum = cursum;
//				end = i;
//			}
//			if(cursum < 0)
//			{
//				cursum = 0;
//				start = i+1;
//			}
//			
//		}
//		System.out.print("Max sum is = "+maxsum);
//		System.out.println();
//		for(int i = start; i<=end;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
// -------------- Find if there is a subarray with 0 sum ---------------------		
// ---------- Input = 2,3,1,-4,3,-2 -----------------------
		
		
//		int prefix_sum_arr[] = new int[size];
//		int count = 0;
//
//		prefix_sum_arr[0] = arr[0];
//		
//		for(int i = 1; i < size; i++)
//		{
//			prefix_sum_arr[i] = arr[i] + prefix_sum_arr[i-1];
//		}
//		
//		for(int i = 0; i < size; i++)
//		{
//			for (int j = i+1; j < size; j++) 
//			{
//				if (prefix_sum_arr[i] == prefix_sum_arr[j]) 
//				{
//					count++;
//				}
//			}
//			
//		}
//		System.out.print("The prefix array: ");
//		for(int ele:prefix_sum_arr) 
//		{
//			System.out.print(ele+" ");
//		}
//		System.out.println();
//		System.out.println();
//
//		System.out.print("The number of times sum is coming to zero in a subarray is "+ count);

		
		
		
		
		
		
		
		
		
		
		
		
// -------------- Find if there is a subarray with 0 sum ---------------------		
// -------------- Input = 2,3,1,-4,3,-2 -----------------------		
// -------------- Better Approach O(n) ---------------------		
		
		
//		
//		Set<Integer> set = new HashSet<>();
//
//		int sum = 0;
//		boolean flag = false;
//		
//		for(int i = 0; i < size; i++)
//		{
//			sum += arr[i];
//			if (set.contains(sum))
//			{
//				flag = true;
//			}
//			else
//			{
//				set.add(sum);
//			}
//		}
//		if (flag == true) 
//		{
//			System.out.println();
//			System.out.print("Contains subarray with sum 0");
//		}
//		else
//		{
//			System.out.println();
//			System.out.print("Contains NO subarray with sum 0");
//		}
//		
//		
		
		
		
		
		
////////////////////////////////////////////////////////////
//  Split array in three equal sum subarrays



//	
//	int sum = 0;
//	int preSum  = 0;
//	int ind1 = -1;
//	int ind2 = -1;
//	
//	for(int i = 0; i < size; i++)
//	{
//		sum += arr[i];
//	}
//	
//	if(sum % 3 != 0)
//	{
//		System.out.println("No three subarrays exist which have equal sum");
//		System.exit(0);
//	}
//	
//	int S1 = sum / 3;
//	int S2 = 2 * S1;
//
//	
//	for(int i = 0; i < size-1; i++)
//	{
//		preSum +=arr[i];
//	
//			if(preSum == S1 && ind1 == -1)
//			{
//				ind1 = i;
//			}
//			else if(preSum == S2 && ind1 != -1)
//			{
//				ind2 = i;
//				break;
//			}
//	
//	}
//	System.out.print("The breaking points are "+ind1+" and "+ind2);
//

	
	
	
	
	
	
	
	
////////////////////////////////////////////////////////////
// Find the largest subarray with equal numbers of 0's and 1 (Brute Force)
//		[0,0,1,0,0,0,1,1]
	
//	
//	int maxlength = 0;
//	
//	for(int i = 0; i < size; i++)
//	{
//		int ones = 0;
//		int zeroes = 0;
//		
//		for(int j = i; j < size; j++)
//		{
//			if (arr[j] == 0)
//			{
//				zeroes++;
//			}
//			else
//			{
//				ones++;
//			}
//			
//			if(zeroes == ones)
//			{
//				maxlength = Math.max(maxlength, j - i + 1);
//			}
//		}
//			
//	}
//	System.out.println(maxlength);
//		
//	
	

	
	
	
////////////////////////////////////////////////////////////
//Find the largest subarray with equal numbers of 0's and 1 (HASH MAP)
//  [0,0,1,0,0,0,1,1]
//
//	int ans = 0;
//	int sum = 0;
//	
//	HashMap<Integer, Integer> map = new HashMap<>();
//		
//	map.put(0,-1);
//	
//	for(int i = 0; i< size; i++)
//	{
//		if(arr[i] == 0)
//		{
//			sum+=-1;
//		}
//		else
//		{
//			sum+=1;
//		}
//		
//		if(map.containsKey(sum))
//		{
//			int index = map.get(sum);
//			int length = i - index;
//			if(length > ans)
//			{
//				ans = length;
//			}
//		}
//		else
//		{
//			map.put(sum, i);
//		}
//		
//	}
//	System.out.println("The length of largest subarray with equal numbers of 0's and 1's is: "+ans);
//		
		
		
		
		
		
		
		

		
		
		
////////////////////////////////////////////////////////////
// Majority element problem (HASH MAP)
// [2,2,2,2,5,5,2,3,3] 
// O(n)
		
//		int count = 0;
//		
//		HashMap<Integer, Integer> map = new HashMap<>();
//		
//		for(int i = 0; i < size; i++)
//		{
//			if(map.containsKey(arr[i]))
//			{
//				count = map.get(arr[i]) + 1;
//				if(count > size / 2)
//				{
//					System.out.print("Majority element found: "+arr[i]);
//					break;
//				}
//				else
//				{
//					map.put(arr[i], count);
//				}
//			}
//			else
//			{
//				map.put(arr[i], 1);
//			}
//			
//		}
//		if(count < size / 2)
//			System.out.print("No Majority element found !!");
		

		
		
		
		
		
		
		
		
		
		
		
////////////////////////////////////////////////////////////
// Majority element problem (Moores Algo)
// [2,2,2,2,5,5,2,3,3] 
// O(n)
		
		
//		int count = 1;
//		int candidate = 0;
//		
//		
//		for(int i = 1; i < size; i++)
//		{
//			if(arr[i] == arr[candidate])
//			{
//				count++;
//			}
//			else
//			{
//				count--;
//			}
//			
//			if(count == 0)
//			{
//				candidate = i;
//				count = 1;
//			}
//			
//		}
//		
//		count = 0;
//		
//		for(int i = 0; i < size; i++)
//		{
//			if(arr[i] == arr[candidate])
//			{
//				count++;
//			}
//		}
//		if(count > size/2)
//		{
//			System.out.print("Majority element found: "+arr[candidate]);
//		}
//		else
//		{
//			System.out.print("No Majority element found !!");
//		}
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
////////////////////////////////////////////////////////////
// Left Rotate an array by K index (By using another array) O(n)
		
//		System.out.print("Enter the index about which you want to rotate the array: ");
//		int k = sc.nextInt();
//		int size_new = 0;
//		
//		
//		int temp[] = new int[size];
//		
//		for(int i = k; i < size; i++)
//		{
//			temp[size_new] = arr[i];
//			size_new++;	
//		}
//		
//		for(int  i = 0; i < k; i++)
//		{
//			temp[size_new] = arr[i];
//			size_new++;
//		}
//		
//		
//		for(int i = 0; i < size; i++)
//		{
//			arr[i] = temp[i];
//		}
//		
//		System.out.println();
//		System.out.println("The rotated array is: ");
//		
//		
//		for(int ele: arr)
//		{	
//			System.out.print(ele + " ");
//		}

		
		
	
		
		
		
		
		
		
		
		
		
		
		
////////////////////////////////////////////////////////////
//Left Rotate an array by K index (By copying the array) O(n*count)
		
//		
//		int count = 1;
//		System.out.print("Enter the index about which you want to rotate the array: ");
//		int k = sc.nextInt();
//		
//		while (count <= k)
//		{
//			int last = arr[0];
//				
//			for(int i = 0; i < size-1; i++)
//			{
//				arr[i] = arr[i+1];
//			}
//			arr[size - 1] = last;
//			count++;
//		}
//		
//		System.out.println();
//		System.out.println("The rotated array is: ");
//		
//		
//		for(int ele: arr)
//		{	
//			System.out.print(ele + " ");
//		}
		
		


		
		
		
		
		
		
		
		
		
		
////////////////////////////////////////////////////////////
//Left Rotate an array by K steps (By copying the array) O(n*count)
//		
//		
//		
//		int count = 1;
//		System.out.print("Enter the index about which you want to rotate the array: ");
//		int k = sc.nextInt();
//			
//			while (count <= k)
//			{
//				int first = arr[size-1];
//					
//				for(int i = size-1; i > 0; i--)
//				{
//					arr[i] = arr[i-1];
//				}
//				arr[0] = first;
//				count++;
//			}
//			
//			
//			for(int ele: arr)
//			{	
//				System.out.print(ele + " ");
//			}
//	
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
////////////////////////////////////////////////////////////
// Given an array arr[], find the maximum j - i such that arr[j] > arr[i]
		// {3,4,5,1,7,2,6,5,4,1}; BRUTE FORCE
		
//		
//	  int ans = 0;
//	  
//	  for(int i = 0; i < size; i++)
//	  {
//		  for(int j = i+1; j < size; j++)
//		  {
//			  if(arr[j] > arr[i])
//				  ans = Math.max(ans, j-i);
//		  }
//	  }
//	  
//	  System.out.print("Max diff is: "+ans);
//	
//		
		
		
		
		
		
		
////////////////////////////////////////////////////////////
//Given an array arr[], find the maximum j - i such that arr[j] > arr[i]
// {3,4,5,1,7,2,6,5,4,1}; 	
		
		
//		int[] rightMax = new int[size];
//		int[] leftMin = new int[size];
//		
//		rightMax[size - 1] = arr[size - 1];
//		
//		for(int i = size - 2; i >= 0; i--)
//		{
//			rightMax[i] = Math.max(arr[i], rightMax[i+1]);
//		}
//		 
//		leftMin[0] = arr[0];
//		
//		for(int i = 1; i < size; i++)
//		{
//			leftMin[i] = Math.min(arr[i], leftMin[i-1]);
//		}
//
//		int i = 0;
//		int j = 0;
//		int ans = 0;
//		
//		while(i < size && j < size)
//		{
//			if(leftMin[i] < rightMax[j])
//			{
//				ans = Math.max(ans, j - i);
//				j++;
//			}
//			else
//				i++;
//		}
//		
//		System.out.print("Maximum difference between the index is: "+ans);
//		
		
		
		
		
		
		
		
		
		
////////////////////////////////////////////////////////////
// Find 2 number in a sorted array with the Given Sum
// 1,2,7,8,10,12
		
	
// 		int left = 0;
// 		int right = size - 1;
// 		
// 		System.out.print("Enter the sum: ");
//		int sum = sc.nextInt();
//		
// 		while(left < right) 
// 		{
// 			if(arr[left] + arr[right] == sum)
// 			{
// 				System.out.print("Pair ("+arr[left]+", "+arr[right]+")");
// 				break;
// 			}
// 			
// 			else if(arr[left] + arr[right] > sum)
// 			{
// 				right--;
// 			}
// 			else
// 				left++;
// 		}
//		System.out.print("Not Found !!!");
	
	}
	
	
	
	
	
	
	
	
////////////////////////////////////////////////////////////
//Find 3 numbers in an unsorted array with the Given Sum
//1,2,4,7,3,5,-2,1    sum = 9
	
	
	
//	static boolean threeSum(int arr[], int sum) 
//	{
//		
//		Arrays.sort(arr);
//		int size = arr.length;
//		boolean found = false;
//		
//		int updated_sum = 0;
//		for(int i = 0; i < size; i++)
//		{
//			updated_sum = sum - arr[i];
//			found = twoSum(arr, updated_sum, size);
//		}
//		if(found)
//			return true;
//		else
//			return false;
//	}
//	
	
	
	
//	static boolean twoSum(int arr[], int sum, int size) 
//	{
//		
//	
//		int left = 0;
//		int right = size - 1;
//		
//		while(left < right) 
//		{
//			if(arr[left] + arr[right] == sum)
//			{
//				return true;
//			}
//			
//			else if(arr[left] + arr[right] > sum)
//			{
//				right--;
//			}
//			else
//				left++;
//		}
//		
//		return false;
//		
//	}
	

}
