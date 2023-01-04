package javaBasics;

import java.util.Scanner;

public class Arrays2d_Questions {

	public static void main(String[] args) {
		
	int arr_2d[][]= {
					 {1,2,3},
					 {5,6,7},
					 {9,10,11}
					
					 };
	
	// Function calling 
	
	PrintMatrix(arr_2d);
	System.out.println();
	Rotate(arr_2d);
	PrintMatrix(arr_2d);

	}
	
	static void PrintMatrix(int arr[][]) 
	{	
		int size = arr.length;	
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("Size of array: "+size);
		
	}
	
	
////////////////////////////////////////////////////////////	
//                 Transpose of a Matrix  
	
	static void Transpose(int arr[][])
	{
		int size = arr.length;
		for(int i = 0; i < size; i++)
		{
			for(int j = i; j < size; j++)
			{
				int swap = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = swap;
			}
		}
	}
	
	
	
	
	
////////////////////////////////////////////////////////////
//             Rotate a square matrix 90° clockwise
	
	
	static void Rotate(int arr[][]) 
	{
		int size = arr.length;
		Transpose(arr);
		
		for(int i = 0; i < size; i++)
		{
			
			int start = 0;
			int end = size - 1;
			do
			{
				int temp = arr[i][start];
				arr[i][start] = arr[i][end];
				arr[i][end] = temp;
				start++;
				end--;
			}while(start < end);
			
			System.out.println("The rotation of above matrix by 90° is: ");
	
		}
	}
	
	
		
	
////////////////////////////////////////////////////////////
//   Search element in Row-wise Column-wise Sorted Matrix 
	
	
	static void searchele(int arr[][]) 
	{
		
		Scanner sc = new Scanner(System.in);
		int size = arr.length;
		int row = 0;
		int col = size - 1;
		boolean flag = false;
	
		System.out.println();
		System.out.print("Please specify the element you want to search: ");
		int ele = sc.nextInt();
		
		
		do
		{
			if(ele == arr[row][col])
			{
				System.out.println();
				System.out.println("Element found at row "+row+" column "+col);
				flag = true;
				break;
				
			}
			else if(ele > arr[row][col])
			{
				row++;
			}
			else
			{
				col--;
			}	
		}while(row < size && col >= 0);
		
		
		
		if(flag == false)
		{
			System.out.println();
			System.out.print("Element not found !!!");
		}
			
	}
	
	

	
	
	
	
	

	
	
	
	
	
	
	
		
	

}
